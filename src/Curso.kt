class Curso(val nombre: String,
            val codigo: String,
            private val estudiantes: MutableList<Estudiante>) {

    fun agregarAlumno(estudiante: Estudiante){

        if (estudiante !in estudiantes){
            estudiantes.add(estudiante)
        }else{
            println("El alumno ya se encuentra en la base de datos!")
        }
    }

    fun mostrarEstudiantes(){

        for ((i, estudiante) in estudiantes.withIndex()) {
            println("CURSO: ${nombre} CÓD: (${codigo})\n--> ESTUDIANTE #${i + 1}:\n\tNOMBRE: ${estudiante.nombre}\n\tDNI: ${estudiante.dni}\n\t")
        }
    }

}