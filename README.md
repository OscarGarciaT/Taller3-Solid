# Taller3-Solid

### 1.	Clases Helado y Pastel. Tienen mucha similitud, se debería crear una clase padre llamada Postre.

Analisis: Por el principio de Liskov se debe crear una case padre ya que una clase padre podria 
realizar los procesos de las clases hijas.

### 2.	Clases Procesos.OperacionesAderezo y Postre. ¿Es necesaria la clase OperacionesAderezo?. Se puede incluir dentro de postre un método para agregar un aderezo y para quitar un aderezo.

Analisis: Se debe quitar la clase OperacionesAderezo por el Open closed principle ya que si se
crean nuevos postres se tendria que modificar este metodo. Si es un metodo de la clase 
Postre, al momento de crear un nuevo postre solo se crea el metodo aqui. 

### 3.	Métodos calcularPrecioFinal() y  showPrecioFinal() están muy relacionados, deben estar en otra clase por si cambia la fórmula de cálculo. La clase nueva debe llamarse Procesos.ManejadorDePrecio.

Analisis: aqui se debe aplicar el single responsibility principle, la clase postre no debe de
encargarse de cuanto es su precio final, no es algo intrinseco del postre. Por eso debe
de ser su propia clase que se encarge de esas operaciones.

### 4.	Enum Adicionales.Aderezo es muy estático, debe convertirse en clase abstract con un atributo nombre y un método abstracto setNombre para que cada tipo de aderezo sea una subclase de Aderezo e implemente dicho método. También, sobrescriba el método toString() en la clase Aderezo, para que devuelva el nombre del aderezo en mayúsculas.

Analisis: Aqui se debe aplicar el principio open-closed principle. Si los aderezos son un enum
y se quieren añadir nuevos aderezos se deberia modificar. Si es un abstract, al añadir
nuevos aderezos solo se crean subclases, dejandolo habierto a extenciones pero no 
a modificaciones.

### 5.	Paquete Leche y la clase Procesos.ManejadorDeLeche. En el main descomente las instrucciones para realizar el cambio del tipo de leche utilizada en cada postre, luego analice como solucionar el error generado en la clase Leche.LecheDeslactosada.

Analisis: Es un problema del principio de Liskov porque como la clase hija es mas restringida que la 
clase padre. La clase padre no puede ser ejecutada donde la clase hija por lo que 
se debe quitar la restriccion para que ambas clases puedan operar como deberian.

### 6.	Cambie el main por el siguiente código y ajuste según su propia implementación.

public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.addAderezos(new Crema());
            postre.addAderezos(new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
        });        
        
    }
