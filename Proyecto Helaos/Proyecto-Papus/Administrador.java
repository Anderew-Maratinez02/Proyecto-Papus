public class Administrador {
    CajaDeHerramientas ch = new CajaDeHerramientas();
    Productos productos = new Productos();
    menusClientes menusCliente = new menusClientes();

    private int pass_Administrador;
    private String semilla = "papus@";

    

    private int numeroDeClientes = 0;
    private double historialPrecioCompraAdmin[] ;
    private int historialIdClienteAdmin[] ;

 
    public void ingresoAdministrador(menusClientes menuCliente) 
    {
        pass_Administrador = ch.pedirNumero();
        if (pass_Administrador == 1233) {
            System.out.println("Acceso válido");
            menuOpcionesAdministrador(menuCliente);
        } else {
            System.out.println("Acceso no válido");
        }
    }

    

    
    /** 
     * menuOpcionesAdministrador
     * 
     * Metodo que muestra un menú del Administrador para dar a elegir entre 9 opciones el cual se
     * podrán realizar operaciones de gestión sobre los registros de compras, cambios de nombres y precios en productos
     * 
     */
    public void menuOpcionesAdministrador(menusClientes menuCliente) 
    {
        int opcion;
        String palabraSegura;
        
       
        do { System.out.println(" ");
            System.out.println("Ajustes del sistema\n"
                    + "1. Cambiar precios \n"
                    + "2. Modificar inventario \n"
                    + "3. Mostar total de cuentas \n"
                    + "4. Mostrar promedio de cuentas \n"   
                    + "5. Suma total ganancias de cuentas \n"
                    + "6. Resetear TODOS los registros de compras \n"
                    + "7. Resetear UN registro de compra \n"
                    + "8. Modificar solo un registro de compra \n"
                    + "9. Salir");
            
            opcion = ch.pedirNumero();
            ch.evitarSaltoDeEnteros();
            switch (opcion) {
                case 1:
                    System.out.println("Estas modificando los precios");
                    System.out.println("Ingresa la palabra clave para continuar");

                    palabraSegura = ch.pedirString();

                if (semilla.equals(palabraSegura)) 
                {
                    System.out.println("Mostrando inventario");
                    System.out.println("Seleccione lo que desea cambiar");

                    menuCliente.productos2.cambiarPrecioProductos();

                } else System.out.println("Ingrese la palabra segura (semilla)");

                    break;
                case 2:
                    System.out.println("Estas modificando el inventario");
                    System.out.println("Ingresa la palabra clave para continuar");
                    palabraSegura = ch.pedirString();
                    

                if (semilla.equals(palabraSegura)) 
                {
                    System.out.println("Mostrando inventario");
                    System.out.println("Seleccione lo que desea cambiar");

                    menuCliente.productos2.cambiarNombreProductos();
                  

                } else System.out.println("Ingrese la palabra segura (semilla)");
      
                    break;
                case 3:
                if (numeroDeClientes > 0) 
                {
                    System.out.println("Estás viendo el historial de pedidos");

                    mostrarHistorialDeVentasClass();
                    
                } else System.out.println("!Aún no hay registros de clientes!");
                    

                break;
                case 4:
                if (numeroDeClientes > 0) 
                {
                    System.out.println("Estás viendo el promedio");

                    System.out.println("|| El promedio de las ganancias es = "+promedioTodasLasCuentas()+" ||"); 
                    
                } else System.out.println("!Aún no hay registros de clientes!");   
                
                break;
                case 5:if (numeroDeClientes > 0) 
                {
                    System.out.println("Estás viendo La suma total de todo el historial de cuentas");
                    System.out.println(" ");
                    System.out.println("|| Suma total = "+ sumarTodasLasCuentas()+" ||");
                    
                } else System.out.println("!Aún no hay registros de clientes!");
                    
                     
                    break;
                case 6:
                System.out.println("Advertencia, todos los registros serán eliminados");
                System.out.println("");
                
                System.out.println("Ingrese la Contraseña Maestra");
                
                palabraSegura = ch.pedirString();

                if (semilla.equals(palabraSegura)) 
                {
                    System.out.println("Estás reseteando registros...");
                    resetearRegistros();

                } else  System.err.println("Contraseña incorrecta");
                   
                break;
                case 7:
                if (numeroDeClientes > 0) 
                {
                   System.out.println("Estás restableciendo SOLO un registro");
                    resetearUnSoloRegistro(); 
                    
                } else System.out.println("!Aún no hay registros de clientes!");
                
                
                    
                    
                break;
                case 8:
                if (numeroDeClientes > 0) 
                {
                     System.out.println("Estás Modificando solo un registro");
                    System.out.println("-----------------------");

                    modificarUnRegistro();
                    
                } else System.out.println("!Aún no hay registros de clientes!");

                break;
                case 9:
                
                System.out.println("Estás saliendo del apartado del administrador");
                    
                break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 9);

    }

    public void mostrarHistorialDeVentasClass() //metodo que te muestra registros de compras de cada cliente
    {
        for (int j = 0; j < historialIdClienteAdmin.length;j++)
        { 
        if (historialIdClienteAdmin[j] != 0)
            { 
                System.out.println("Ciente ( #ID " + historialIdClienteAdmin[j] +" )"+ " " + historialPrecioCompraAdmin[j] + " $");
                
            }
            
        }
    }

    public double sumarTodasLasCuentas () //metodo de sumar todos los registros
    {double totalSuma= 0;
        for (int j = 0; j < historialPrecioCompraAdmin.length;j++)
        { 
            totalSuma += historialPrecioCompraAdmin[j];
        }
        return totalSuma;
    }

    public double promedioTodasLasCuentas () //metodo de obtener el promedio de todos los registros
    {double totalpromedio= 0;
        
        totalpromedio = sumarTodasLasCuentas() / numeroDeClientes;
        return totalpromedio;
    }

    public void resetearRegistros () // metodo para poner todos los registros a 0
    {
        for (int j = 0; j < historialPrecioCompraAdmin.length;j++)
        { 
           historialIdClienteAdmin[j] = 0;
           historialPrecioCompraAdmin[j] = 0;
        }
        numeroDeClientes = 0;
    }

    public void modificarUnRegistro ()  // metodo para modificar un solo registro a 0
    {int numPedido = 0; 
        for (int j = 0; j < historialPrecioCompraAdmin.length;j++)
        { 
            if (historialIdClienteAdmin[j] != 0)
            { 
                System.out.println("Ciente º"+j+ "( #ID " + historialIdClienteAdmin[j] +" )"+ " " + historialPrecioCompraAdmin[j] + " $");
            }
        }
        System.out.println("-----------------------");
        System.out.println("Elige Número de Cliente (NO numero ID) para cambiar su ID Y CUENTA");
        numPedido = ch.pedirNumero();

        System.out.println("Introduce nuevo ID del cliente");

        historialIdClienteAdmin[numPedido] = ch.pedirNumero();

        System.out.println("Introduce nueva Cuenta del cliente");

        historialPrecioCompraAdmin[numPedido]= ch.pedirDoubles();

        System.out.println("Resultado final = "+ "( #ID " + historialIdClienteAdmin[numPedido] +" )"+ " " + historialPrecioCompraAdmin[numPedido] + " $");
       
    }

    public void resetearUnSoloRegistro () //metodo para restablecer un solo registro a 0
    {int numPedido = 0; 
        for (int j = 0; j < historialPrecioCompraAdmin.length;j++)
        { 
            if (historialIdClienteAdmin[j] != 0)
            { 
                System.out.println("Cliente º"+j+ "( #ID " + historialIdClienteAdmin[j] +" )"+ " " + historialPrecioCompraAdmin[j] + " $");
                
            }
            
        }
        System.out.println("-----------------------");
        System.out.println("Elige Número de Cliente (NO numero ID) para Restablecer su ID Y CUENTA");
        numPedido = ch.pedirNumero();

        historialIdClienteAdmin[numPedido] = 0;
        historialPrecioCompraAdmin[numPedido] = 0;

        numeroDeClientes -= 1; 

        System.out.println("Cliente restablecido...");

    }
    
    public void setnumeroDeClientes(int numeroDeClientes) {
        this.numeroDeClientes = numeroDeClientes;
    }

    public void setHistorialPrecioCompraAdmin(double[] historialPrecioCompraAdmin) {
        this.historialPrecioCompraAdmin = historialPrecioCompraAdmin;
    }

    public void setHistorialIdClienteAdmin(int[] historialIdClienteAdmin) {
        this.historialIdClienteAdmin = historialIdClienteAdmin;
    }

}

