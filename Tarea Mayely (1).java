// Clase base Persona
class Persona {
    private String nombre;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para mostrar información básica de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

// Subclase Doctor con años de experiencia
class Doctor extends Persona {
    private String especialidad;
    private int anosExperiencia;

    // Constructor de la subclase Doctor
    public Doctor(String nombre, int edad, String especialidad, int anosExperiencia) {
        super(nombre, edad);  // Llama al constructor de la clase base Persona
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }

    // Getters y setters para los atributos específicos de Doctor
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    // Sobrescribe el método mostrarInformacion de Persona
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al método de la clase base Persona
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años de experiencia: " + anosExperiencia);
    }
}

// Subclase Deportista con logros
class Deportista extends Persona {
    private String deporte;
    private String logros;

    // Constructor de la subclase Deportista
    public Deportista(String nombre, int edad, String deporte, String logros) {
        super(nombre, edad);  // Llama al constructor de la clase base Persona
        this.deporte = deporte;
        this.logros = logros;
    }

    // Getters y setters para los atributos específicos de Deportista
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getLogros() {
        return logros;
    }

    public void setLogros(String logros) {
        this.logros = logros;
    }

    // Sobrescribe el método mostrarInformacion de Persona
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al método de la clase base Persona
        System.out.println("Deporte: " + deporte);
        System.out.println("Logros: " + logros);
    }
}

// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto Doctor y un objeto Deportista
        Doctor doctor = new Doctor("Mary", 33, "Cardiología", 20);
        Deportista deportista = new Deportista("Angel", 20, "Fútbol", "Campeón Nacional 2023");

        // Mostrar información del doctor
        System.out.println("Información del Doctor:");
        doctor.mostrarInformacion();

        // Separador entre los dos informes
        System.out.println("\nInformación del Deportista:");
        
        // Mostrar información del deportista
        deportista.mostrarInformacion();
    }
}
