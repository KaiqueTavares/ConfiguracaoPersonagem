package com.example.logonrm.configuracaopersonagem

/*ENUM CRIADO PARA PEGAR OS DADOS DO MEU ARRAY, FAÇO ISSO PARA DEIXAR O CODIGO MAIS LEGIVEL*/
/*COMPANION OBJECT VOU CRIAR UM OBJETO STATICO, VOU TER QUE PASSAR PARAMETROS NA HORA DE CHAMAR O METODO(FUN)*/
enum class TipoPersonagemEnum(val id: Int){
    ANAO(0),
    ELFO(1),
    ORC(2),
    GUERREIRO(3),
    MAGO(4);

    //O fun esta buscando um int que passara para o tipopersonagemEnum que vai ser igual ao um valor onde ele vai achar a primeira
    //(first) quando o id for igual ao que ele buscou no findValue
    companion object {
        fun from(findValue: Int):TipoPersonagemEnum=
                TipoPersonagemEnum.values().first{it.id == findValue}
    }
}
