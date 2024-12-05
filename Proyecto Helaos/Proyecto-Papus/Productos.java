public class Productos {
    CajaDeHerramientas ch = new CajaDeHerramientas();

    private String[] helados;
    private String[] granizado;
    private String[] gofres;
    private String[] bebidas;

    private double precioHelados[];
    private double precioGranizado[];
    private double precioGofres[];
    private double precioBebidas[];

    private double [] cuenta;
    private int tamCuenta; 



    

    protected Productos() {
        this.helados = new String[]{"Helado de fresa", "Helado de limón", "Helado de nieve"};
        this.granizado = new String[]{"Granizado de piña", "Granizado de Cola", "Granizado de kiwi"};
        this.gofres = new String[]{"Gofre de chocolate", "Gofre de vainilla", "Gofre Mixto"};
        this.bebidas = new String[]{"Colaculo", "Zumo melocotón", "Ron cola"};
        this.precioHelados = new double[] {5,4,3};
        this.precioGranizado = new double[] {3,3.5,4};
        this.precioGofres = new double[] {6.5,6.5,8};
        this.precioBebidas = new double[] {3,4,6.99};
        this.cuenta = new double[tamCuenta];
    }

    protected void getTodosLosProductos() {
        for (int i = 0; i < helados.length; i++) {
            System.out.println(helados[i]);
        }

        for (int a = 0; a < granizado.length; a++) {
            System.out.println(granizado[a]);
        }

        for (int b = 0; b < gofres.length; b++) {
            System.out.println(gofres[b]);
        }

        for (int c = 0; c < bebidas.length; c++) {
            System.out.println(bebidas[c]);
        }

    }
        public double getCuenta()   
    {double aux = 0;
        for(int i =0;i < cuenta.length;i++)
        {
           aux += cuenta[i];
        }
        return aux;
    }
    protected void cambiarNombreProductos() { // Esta funcion aun no esta en uso y podrias meterla en administrador
        int numElegir = 0;
        int numElegirProducto= 0;
        String nombreNuevo = "jija";
       
        
        do {System.out.println("Elije que apartado del producto 1-4");
        System.out.println("1º Helados");
        System.out.println("2º Granizado");
        System.out.println("3º Gofres");
        System.out.println("4º Bebidas");
        System.out.println("5º Salir");
        

        numElegir = ch.pedirNumero();

        switch (numElegir) {
            case 1:for (int i = 0; i < helados.length; i++) {
                System.out.println("º" + (i+1) + " " + helados[i]);
            }
            System.out.println("Estas cambiando... Helados, elige cual cambiar");
            numElegirProducto = ch.pedirNumero();
            ch.evitarSaltoDeEnteros();
            if (numElegirProducto == 1) 
            {
                nombreNuevo = ch.pedirString();
               helados[0] =  nombreNuevo;
            }
            
            else if (numElegirProducto == 2) 
            {
                nombreNuevo = ch.pedirString();
               helados[1] =  nombreNuevo;
            }
            
            else if (numElegirProducto == 3) 
            {
                nombreNuevo = ch.pedirString();
               helados[2] =  nombreNuevo;
            }

            break;
            case 2:for (int i = 0; i < granizado.length; i++) {
                System.out.println("º" + (i+1) + " " + granizado[i]);
            }
            System.out.println("Estas cambiando... granizados, elige cual cambiar");
            numElegirProducto = ch.pedirNumero();
            ch.evitarSaltoDeEnteros();

            if (numElegirProducto == 1) 
            {
                nombreNuevo = ch.pedirString();
               granizado[0] =  nombreNuevo;
            }
            
            else if (numElegirProducto == 2) 
            {
                nombreNuevo = ch.pedirString();
               granizado[1] =  nombreNuevo;
            }
            
            else if (numElegirProducto == 3) 
            {
                nombreNuevo = ch.pedirString();
               granizado[2] =  nombreNuevo;
            }
            break;
            case 3:for (int i = 0; i < gofres.length; i++) {
                System.out.println("º" + (i+1) + " " + gofres[i]);
            }
            System.out.println("Estas cambiando... gofres, elige cual cambiar");
            numElegirProducto = ch.pedirNumero();
            ch.evitarSaltoDeEnteros();

            if (numElegirProducto == 1) 
            {
                nombreNuevo = ch.pedirString();
               gofres[0] =  nombreNuevo;
            }
            
            else if (numElegirProducto == 2) 
            {
                nombreNuevo = ch.pedirString();
               gofres[1] =  nombreNuevo;
            }
            
            else if (numElegirProducto == 3) 
            {
                nombreNuevo = ch.pedirString();
               gofres[2] =  nombreNuevo;
            }
            break;
            case 4:for (int i = 0; i < bebidas.length; i++) {
                System.out.println("º" + (i+1) + " " + bebidas[i]);
            }
            System.out.println("Estas cambiando... bebidas, elige cual cambiar");
            numElegirProducto = ch.pedirNumero();
            ch.evitarSaltoDeEnteros();

            if (numElegirProducto == 1) 
            {
                nombreNuevo = ch.pedirString();
               bebidas[0] =  nombreNuevo;
            }
            
            else if (numElegirProducto == 2) 
            {
                nombreNuevo = ch.pedirString();
               bebidas[1] =  nombreNuevo;
            }
            
            else if (numElegirProducto == 3) 
            {
                nombreNuevo = ch.pedirString();
               bebidas[2] =  nombreNuevo;
            }
            break;
        
            default:System.out.println("Opcion de clase de producto incorrecta o desconocida");
                break;
        }
        } while (numElegir != 5);
    }

    protected void getHelados() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");

            for (int i = 0; i < helados.length; i++) {
                System.out.println("º" + (i + 1) + " " + helados[i]);
                System.out.println("-------------------");

            }
            numElegir = ch.pedirNumero();

            switch (numElegir) {

                case 1: System.out.println("||¿Deseas este producto? "+helados[0]+ " ||");

                System.out.println("si - no");
                    char charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ helados[0] +" ||");
                        
                        for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioHelados[0];  
                        }
                        
                        }
                       tamCuenta++;
                    }
        
                break;

                case 2: 
                        System.out.println("||¿Deseas este producto? "+ helados[1]+ " ||");

                        System.out.println("si - no");
                         charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ helados[1] +" ||");
                       
                        for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioHelados[1];  
                        }
                        
                        }
                       tamCuenta++;
                    }
                break;

                
                case 3: System.out.println("||¿Deseas este producto? "+ helados[2]+ " ||");

                        System.out.println("si - no");
                        charConfirmar = ch.confirmarPedido();

                        if (charConfirmar == 's') 
                        {
                            System.out.println("||Elegiste... "+ helados[2] +" ||");
                            for(int c = 0;c < cuenta.length;c++ )
                            {
                            
                            if (cuenta[c] == 0) 
                            {
                                cuenta[c] += precioHelados[2];  
                            }
                            
                            }
                           tamCuenta++;
                        }
                break;
            
                default:System.out.println("||Elegiste... "+ " una opción incorrecta||");
               
                break;
            }



        } while (numElegir != 0);

    }

   protected void getGranizados() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");

            for (int a = 0; a < granizado.length; a++) {
                System.out.println("º" + (a + 1) + " " + granizado[a]);
                System.out.println("-------------------");

            }
            numElegir = ch.pedirNumero();

            switch (numElegir) {

                case 1: System.out.println("||¿Deseas este producto? "+granizado[0]+ " ||");

                System.out.println("si - no");
                    char charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ granizado[0] +" ||");
                        for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioGranizado[0];  
                        }
                        
                        }
                       tamCuenta++;
                    }
        
                break;

                case 2: 
                        System.out.println("||¿Deseas este producto? "+ granizado[1]+ " ||");

                        System.out.println("si - no");
                         charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ granizado[1] +" ||");
                        for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioGranizado[1];  
                        }
                        
                        }
                       tamCuenta++;
                    }
                break;

                
                case 3: System.out.println("||¿Deseas este producto? "+ granizado[2]+ " ||");

                        System.out.println("si - no");
                        charConfirmar = ch.confirmarPedido();

                        if (charConfirmar == 's') 
                        {
                            System.out.println("||Elegiste... "+ granizado[2] +" ||");
                            for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioGranizado[2];  
                        }
                        
                        }
                       tamCuenta++;
                        }
                break;
            
                default:System.out.println("||Elegiste... "+ " una opción incorrecta||");
               
                break;
            }



        } while (numElegir != 0);
    }


    protected void getGofres() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");


            {
                for (int b = 0; b < gofres.length; b++)
                    System.out.println("º" + (b + 1) + " " + gofres[b]);
                System.out.println("-------------------");


            }
            numElegir = ch.pedirNumero();

            switch (numElegir) {

                case 1: System.out.println("||¿Deseas este producto? "+gofres[0]+ " ||");

                System.out.println("si - no");
                    char charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ gofres[0] +" ||");
                        for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioGofres[0];  
                        }
                        
                        }
                       tamCuenta++;
                    }
        
                break;

                case 2: 
                        System.out.println("||¿Deseas este producto? "+ gofres[1]+ " ||");

                        System.out.println("si - no");
                         charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ gofres[1] +" ||");
                        for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioGofres[1];  
                        }
                        
                        }
                       tamCuenta++;
                    }
                break;

                
                case 3: System.out.println("||¿Deseas este producto? "+ gofres[2]+ " ||");

                        System.out.println("si - no");
                        charConfirmar = ch.confirmarPedido();

                        if (charConfirmar == 's') 
                        {
                            System.out.println("||Elegiste... "+ gofres[2] +" ||");
                            for(int c = 0;c < cuenta.length;c++ )
                            {
                            
                            if (cuenta[c] == 0) 
                            {
                                cuenta[c] += precioGofres[2];  
                            }
                            
                            }
                           tamCuenta++;
                        }
                break;
            
                default:System.out.println("||Elegiste... "+ " una opción incorrecta||");
               
                break;
            }


        } while (numElegir != 0);
    }

   protected void getBebidas() {
        int numElegir = 0;
        do {
            System.out.println("Elige una opción, salir (0)");
            System.out.println(" ");


            {
                for (int c = 0; c < bebidas.length; c++)
                    System.out.println("º" + (c + 1) + " " + bebidas[c]+" "+precioBebidas[c]+" $");
                System.out.println("-------------------");


            }
           
            numElegir = ch.pedirNumero();

            switch (numElegir) {

                case 1: System.out.println("||¿Deseas este producto? "+ bebidas[0]+ " ||");

                System.out.println("si - no");
                    char charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ bebidas[0] +" ||");
                        for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioBebidas[0];  
                        }
                        
                        }
                       tamCuenta++;
                    }
        
                break;

                case 2: 
                        System.out.println("||¿Deseas este producto? "+ bebidas[1]+ " ||");

                        System.out.println("si - no");
                         charConfirmar = ch.confirmarPedido();

                    if (charConfirmar == 's') 
                    {
                        System.out.println("||Elegiste... "+ bebidas[1] +" ||");
                        for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioBebidas[1];  
                        }
                        
                        }
                       tamCuenta++;
                    }
                break;

                
                case 3: System.out.println("||¿Deseas este producto? "+ bebidas[2]+ " ||");

                        System.out.println("si - no");
                        charConfirmar = ch.confirmarPedido();

                        if (charConfirmar == 's') 
                        {
                            System.out.println("||Elegiste... "+ bebidas[2] +" ||");
                            for(int c = 0;c < cuenta.length;c++ )
                        {
                        
                        if (cuenta[c] == 0) 
                        {
                            cuenta[c] += precioBebidas[2];  
                        }
                        
                        }
                       tamCuenta++;
                        }
                break;
            
                default:System.out.println("||Elegiste... "+ " una opción incorrecta||");
               
                break;
            }



        } while (numElegir != 0);
    }

}