public class App {
    public static void main(String[] args) throws Exception {
       try {
            Pelanggan p1 = new Pelanggan();
            p1.daftarmember(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            
        }
    }

}
