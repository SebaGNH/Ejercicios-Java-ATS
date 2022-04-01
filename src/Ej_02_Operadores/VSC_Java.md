# Crear Proyecto en VSC ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- 
-Nuevo Proyecto: Ctrl + Shift + p

-Escribir en la consola "create java project"

-Seleccionar "No Build Tools"

-Al darle enter nos abrirá el buscador de carpetas y aquí tenemos que indicar la ubicación "TUP-Ejercicios-Poo", 
    para que automaticamente nos cree una carpeta con el nombre del Proyecto

-Ingresar el nombre del proyecto, se creará una carpeta con el nombre, procurar que la ubicación sea donde están todos los proyectos, 
    NO crear una carpeta ya que el sistema la crea.
  

/* Inicio <-- Java otro tutorial ----- ----- ----- ----- ----- ----- ----- */

Para iniciar un proyecto ir a la carpeta src, sobre el abrir la terminar y escribir dir, de esta manera tendremos el nombre 
luego escribir "java" espacio el nombre del proyecto.java  Ej "java holaMundo.java" 
  


# ----- .gitignore para java Netbeans ~~~~~  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
/build/
/nbproject/
build.xml
manifest.mf

# Netbeans ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----

## Ejercicios por completar
+TUP-Ejercicios-Poo
--sp-Banco-22 <-- Está la lógica, pero faltan los formularios
--mil-Complejo-Cine 	<--Solo está la carpeta, necesito hibernet para completarlo
--pp-Biblioteca-22 <--consola funcionando, estaría bueno hacerle la interface grafica
--PP-Clinica-21  
--pp-Municipalidad-22 <--está completo, pero no arroja bien los resultados
--PP-Veterinaria-21
--sp-Cargar-Persona-22 <-- Funcionando ok
--sp-EstudianteHereda-22 <--Funcionando ok


Ctrl + barra espaciadora completa los campos
alt + incert agrega

InterfaceGraficaNombre

consola
salidaConsola
appMain




# Código Suelto ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- ----- -----
```java
final int numero;  //Con final declaramos como constante

this.lblDiasTrabajados.setEnabled(false);  // Habilitar lbl
this.cboTipo.setSelectedIndex(0);
this.cboTipo.getSelectedIndex();
this.txtLegajo.setText("");
this.txtLegajo.requestFocus();

this.txtLegajo.getText().equals("")
this.txtLegajo.getText().isEmpty()
this.txtLegajo.getText().contains("f");  //Pregunta si contiene una f


this.lsLista.setListData(empresa.empleados.toArray())



if (lista.isVisible()==false) {
    lista.setVisible(true);

    lista.dispose();


lsLista.setListData(lista.toArray());


 this.setLocationRelativeTo(null); // Para que la ventana aparezca en el centro

String.valueOf(float f) 

System.out.print("Ingrese un numero: ")  //para el ingreso de datos no se usa el ln
sc.next(); // Solo guarda la primer palabra hasta encontrar un espacio   "Hola que tal" no funcionaría
sc.nextLine(); // para cadenas largas
sc.next().charAt(0);//Para ingresar Char en la posición 0

JOptionPane.showMessageDialog(null, "Debe Completar todos los campos");
cadena = JOptionPane.showInputDialog("Ingrese una cadena")
unCaracter = cadena.charAt(0);



double raizCuadrada = Math.sqrt(9) // 3.0  // ra

double base = 5, altura = 2;
double resultado = Math.pow(base,altura) // 25.0

double numero = 4.56;
long resultado = Math.round(numero);  //este método recupe por parametros un long o un float

float numero = 4.56f;
int resultado = Math.round(numero); //Si le enviamos un float el resultado debe ser guardado en un int


double numero = Math.random(); del 0 al 0.99

int numero = Math.random() * 100; //el valor será del 1 al 100, a este valor hay que redondearlo y pasarlo a int

```

