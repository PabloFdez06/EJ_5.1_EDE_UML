fun main(){
    val curso1 = Curso("1ºDAWB", "A4898735", mutableListOf())
    val curso2 = Curso("2ºDAWA", "A4823479", mutableListOf())

    val estudiante1 = Estudiante("Pablo", "77178650b")
    val estudiante2 = Estudiante("Fran", "84387823a")
    val estudiante3 = Estudiante("Inda", "89787823j")
    val estudiante4 = Estudiante("Rocio", "8962182zJ")
    val estudiante5 = Estudiante("Danie", "89787823p")
    val estudiante6 = Estudiante("Antonio", "8909823i")

    estudiante1.inscribirse(curso1)
    estudiante2.inscribirse(curso1)
    estudiante3.inscribirse(curso1)
    estudiante4.inscribirse(curso2)
    estudiante5.inscribirse(curso2)
    estudiante6.inscribirse(curso2)

    curso1.mostrarEstudiantes()
    curso2.mostrarEstudiantes()

}