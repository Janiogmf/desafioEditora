#language: pt
@newsletters_geral
Funcionalidade: Realizar cadastro de boletins newsletters para assinantes e não-assinantes 

Contexto: cadastro de boletins newsletters
Dado que acesse o site "https://oglobo.globo.com/newsletter/cardapio/".

@Cadastro-Assinantes
Cenario: cadastro_assinantes
Dado clicar botão "ESCOLHER NEWSLETTERS".
E digitar CPF "".
E digitar email "".
Quando escolher newsletter que deseja receber:
	|Tipo                    |Seleção|
	| Assinante Sabe Mais    |   X   |
	| Assinante Sabe Antes   |       |
	| Opinião                |   X   |
Entao clicar botão "ENVIAR"

@Cadastro-Nao/Assinantes
Cenario: cadastro_nao_assinantes
Quando escolher edição de preferência:
	|Edição        |Seleção|
	|Diárias       |   X   |
	|Ela           |   X   |
	|Acervo        |       |
	|RioShow       |   X   |
	|Eleições 2018 |   X   |
	|Saber viver   |       |
	|Gastronomia   |   X   |
E digitar e-mail "".
E confirmar e-mail "".
E clicar TROCAR IMAGEM "sim".
E Digitar texto imagem.
Entao clicar "Inscreva-se"
E validar advertência escolha edição.
E validar advertência digitação imagem incorreta.
E validar mensagem sucesso.
