package control

import bussines.ConvidadoBussines
import entity.Convite

class Portaria {

    private val convidadoBussines = ConvidadoBussines()


    init {

        println("Portaria inicializada.")
        println(controle())

    }


    private fun controle(): String{

        val idade = Console.readInt("Qual é a sua idade? ")
        val convidado = Convite(idade = idade)
        if(!convidadoBussines.maiorDeIdade(convidado.idade)){
            return "Negado. Menores de idade não são permitidos."

        }

        convidado.tipo = Console.readString("Qual é o tipo de convite? ")
        if (!convidadoBussines.tipoValido(convidado.tipo)){
            return "Negado. Convite inválido."
        }

        convidado.codigo = Console.readString("Qual o código do convite? ")
        if (!convidadoBussines.convidadoValido(convidado)){
            return "Negado. Convite inválido."
        }

        return "Welcome! :)"
    }


}

/*fun main() {
    control.Portaria()
}
*/
// Função portaria usada para consulta
/*
fun portaria() {
    print("Qual sua idade? ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. entity.Convite inválido.")
            return
        }

        print("Qual o código do convite? ")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()

            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. entity.Convite inválido")
            }
        }
    }
}
* */