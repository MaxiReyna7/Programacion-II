    public static void main(String[] args) {

    }

    public class Persona {
        private String nombre;
        private String apellido;
        private String numeroIdentificacion;
        private int edad;
        private String direccion;
        private String telefono;

        public Persona(String nombre, String apellido, String numeroIdentificacion, int edad, String direccion, String telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.numeroIdentificacion = numeroIdentificacion;
            this.edad = edad;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getNumeroIdentificacion() {
            return numeroIdentificacion;
        }

        public int getEdad() {
            return edad;
        }

        public String getDireccion() {
            return direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setNombre(String nombre) {
            if (nombre == null) {
                throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío.");
            }
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            if (apellido == null) {
                throw new IllegalArgumentException("El apellido no puede ser nulo ni vacío.");
            }
            this.apellido = apellido;
        }

        public void setNumeroIdentificacion(String numeroIdentificacion) {
            this.numeroIdentificacion = numeroIdentificacion;
        }

        public void setEdad(int edad) {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }
            this.edad = edad;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public class Estudiante extends Persona {
            private String matricula;
            private String carrera;
            private double promedio;

            public Estudiante(String nombre, String apellido, String numeroIdentificacion, int edad, String direccion, String telefono,
                              String matricula, String carrera, double promedio) {
                super(nombre, apellido, numeroIdentificacion, edad, direccion, telefono); // Llama al constructor de Persona

                setMatricula(matricula);
                setCarrera(carrera);
                setPromedio(promedio);
            }

            public String getMatricula() {
                return matricula;
            }

            public String getCarrera() {
                return carrera;
            }

            public double getPromedio() {
                return promedio;
            }

            public void setMatricula(String matricula) {
                if (matricula == null) {
                    throw new IllegalArgumentException("La matrícula no puede estar vacía.");
                }
                this.matricula = matricula;
            }

            public void setCarrera(String carrera) {
                if (carrera == null) {
                    throw new IllegalArgumentException("La carrera no puede estar vacía.");
                }
                this.carrera = carrera;
            }

            public void setPromedio(double promedio) {
                if (promedio < 0.0 || promedio > 10.0) {
                    throw new IllegalArgumentException("El promedio debe estar entre 0.0 y 10.0.");
                }
                this.promedio = promedio;
            }

            public void estudiar() {
                System.out.println("El estudiante " + getNombre() + " " + getApellido() + " está estudiando " + carrera + ".");
            }

            @Override
            public void mostrarInformacion() {
                super.mostrarInformacion();
                System.out.println("Matrícula: " + matricula);
                System.out.println("Carrera: " + carrera);
                System.out.println("Promedio: " + promedio);
            }
        }
    }