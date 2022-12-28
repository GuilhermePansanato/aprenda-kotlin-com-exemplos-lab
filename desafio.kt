enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    infix fun matricular(usuario: Usuario) {
       inscritos.add(usuario)}
  
    fun matricular(vararg usuarios: Usuario){
        for(usuario in usuarios)
            inscritos.add(usuario)
    }
       
       
    fun mostrarInscritos (){
        for (inscrito in inscritos)
         println(inscrito.nome)
    }   
    }


fun main() {
    val gui = Usuario("gui")
    val ele = Usuario("ele")

    
    val listaConteudos: List<ConteudoEducacional> = listOf(ConteudoEducacional("Introdução"))
    
    val kotlin = Formacao ("Kotlin", listaConteudos, Nivel.BASICO)
    
    kotlin.matricular(gui, ele)
    
    kotlin.mostrarInscritos ()
}