# Interpretación del significado del diagrama de clases

## a. Relación entre las clases: Significado, tipo, multiplicidad

**Significado:**  
Es una relación en la que una de las clases representa un todo y la otra representa parte de ese todo.  

**Tipo:**  
Agregación  

**Multiplicidad:**  
1 a muchos  

---

## b. Elementos de las clases: Tipos y propósito

### Clase: Curso
- **Atributos:**
  - `nombre: String`
  - `codigo: String`
  - `estudiantes: MutableList`

- **Métodos:**
  - `agregarAlumno(estudiante: Estudiante)`
  - `mostrarEstudiante(estudiante: Estudiante)`

### Clase: Estudiante
- **Atributos:**
  - `nombre: String`
  - `dni: String`

- **Métodos:**
  - `inscribirse(curso: Curso)`

---

## c. Significado del método `agregarAlumno()`

Llamando a la función `agregarAlumno()`, se solicita un parámetro que se obtiene como `estudiante`, el cual contiene la información del estudiante, incluyendo el `dni` (dependiendo de cómo esté configurado). Este método permite agregar un estudiante al curso.

---

## d. Significado del método `inscribirse()`

Es un método que tiene como parámetro otra función. Al ser llamado, obtiene el parámetro del curso al que el estudiante se inscribirá.

## 2. ESTE APARTADO SE ENCUENTRA EN LA CARPETA SRC.
