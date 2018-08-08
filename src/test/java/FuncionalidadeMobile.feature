#language: pt
@FuncionalidadesFotogalerias

Funcionalidade: Validar funcionalidade página Fotogalerias

Contexto: cadastro de boletins newsletters
Dado que acesse o site "https://m.oglobo.globo.com/fotogalerias/".
  
  @Areas_Fotografias
  Cenario: Validar numeros de acordo com as areas fotografias.
    Entao validar numero 6 fotografias area recomendados.
    Entao validar numero 3 fotografias area mais vistas.
    Dado validar opcao defaut de selecao "Todas".
    E validar numero 3 fotografias area ultimas de.
    Entao selecionar "Economia" Select ultimas de.
    E validar numero 3 fotografias area ultimas de.
    

