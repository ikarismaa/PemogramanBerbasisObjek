class tesBank2 {
    public static void main (String[] args) {
        int i;
        Account [] accounts = new Account[100];
        accounts [0] = new Account(2000000);
        accounts [1] = new Account(0);
        for (i = 0; i<2; i++){
            System.out.println("Saldo awal account ke"+ i +" = " +accounts[i].getBalance());
            try{
                accounts[i].withdraw(1000000);
                double b = accounts[i].getBalance();
                System.out.println("Saldo akhir account ke"+ i +" = "+b);
            }catch (OverdraftException ode){
                System.out.println("null" +ode);
            }
        }
    }
}