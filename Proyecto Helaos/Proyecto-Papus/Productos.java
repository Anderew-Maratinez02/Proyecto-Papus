public class Productos {
    public  String [] helados;
    public  String [] granizado;
    public  String [] gofres;
    public  String [] bebidas;
    
    public Productos(String[] helados, String[] granizado, String[] gofres, String[] bebidas) {
        this.helados = helados;
        this.granizado = granizado;
        this.gofres = gofres;
        this.bebidas = bebidas;
    }

    public void getTodosLosProductos()
    {
        for (int i = 0;i < helados.length;i++) 
        {
            System.out.println(helados[i]);
        } 

        for (int a = 0;a < granizado.length;a++) 
        {
            System.out.println(granizado[a]);
        }

        for (int b = 0;b < gofres.length;b++) 
        {
            System.out.println(gofres[b]);
        }

        for (int c = 0;c < bebidas.length;c++) 
        {
            System.out.println(bebidas[c]);
        }

    }

    public void getHelados() {
        for (int i = 0;i < helados.length;i++) {
            System.out.println(helados[i]);
        }
    }
    public void getGranizados() {
        for (int i = 0;i < granizado.length;i++) {
            System.out.println(granizado[i]);
        }
    }

    public void getGofres() {
        for (int i = 0;i < gofres.length;i++) {
            System.out.println(gofres[i]);
        }
    }

    public void getBebidas() {
        for (int i = 0;i < bebidas.length;i++) {
            System.out.println(bebidas[i]);
        }
    }


   




  
    

}
