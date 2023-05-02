## users-api
### An Api to save users
## Instalação e configuração
### Para rodar o projeto localmente, siga os passos abaixo:

### Pré-requisitos
   - Maven 
   - Java 8 ou superior instalado
   - Banco de dados Postgres instalado e configurado

### Clone do repositório
Para obter o código fonte da API, faça o clone do repositório no Github:

git clone https://github.com/seu-usuario/users-api.git

### Configurando o banco de dados

Antes de executar a API, é necessário configurar o banco de dados (Postgres nesse caso). Para isso, siga os passos abaixo:

   - Abra o arquivo src/main/resources/application.yml
   - Na seção datasource, atualize e configure as informações de acordo com a configuração do banco de dados.

### Execute o comando abaixo para iniciar aplicação:

### Rodando com Maven:
   - mvn spring-boot:run
