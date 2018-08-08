#language: pt
@newsletters_geral
Funcionalidade: Realizar cadastro de boletins newsletters para assinantes e n�o-assinantes 

Contexto: cadastro de boletins newsletters
Dado que acesse o site "https://oglobo.globo.com/newsletter/cardapio/".

@Cadastro-Assinantes
Cenario: cadastro_assinantes
Dado clicar bot�o "ESCOLHER NEWSLETTERS".
E digitar CPF "".
E digitar email "".
Quando escolher newsletter que deseja receber:
	|Tipo                    |Sele��o|
	| Assinante Sabe Mais    |   X   |
	| Assinante Sabe Antes   |       |
	| Opini�o                |   X   |
Entao clicar bot�o "ENVIAR"

@Cadastro-Nao/Assinantes
Cenario: cadastro_nao_assinantes
Quando escolher edi��o de prefer�ncia:
	|Edi��o        |Sele��o|
	|Di�rias       |   X   |
	|Ela           |   X   |
	|Acervo        |       |
	|RioShow       |   X   |
	|Elei��es 2018 |   X   |
	|Saber viver   |       |
	|Gastronomia   |   X   |
E digitar e-mail "".
E confirmar e-mail "".
E clicar TROCAR IMAGEM "sim".
E Digitar texto imagem.
Entao clicar "Inscreva-se"
E validar advert�ncia escolha edi��o.
E validar advert�ncia digita��o imagem incorreta.
E validar mensagem sucesso.
