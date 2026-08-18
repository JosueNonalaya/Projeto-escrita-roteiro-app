# Projeto-escrita-roteiro-app

## Definição

Este projeto tem como finalidade auxiliar no processo de criação e pré-produção de materiais e conteúdos audiovisuais e cinematográficos.

É focado em roteiristas e entusiastas que desejam criar suas histórias, dar forma às suas narrativas e diálogos, auxiliando na construção dos personagens e na visualização do material produzido.

O aplicativo também permite criar storyboards e adicionar trilhas sonoras às cenas e partes do material, possibilitando realizar a leitura simultaneamente à visualização dos shots e à reprodução da música.

Também será possível criar automaticamente um casting de atores para os personagens, listas de locações de filmagem e os props necessários, com base nas informações presentes no roteiro. Dessa forma, o aplicativo poderá auxiliar no controle da produção e na realização de previsões de orçamento.

---
## Metodologias e Ferramentas de Desenvolvimento

Durante o desenvolvimento do projeto são utilizadas metodologias e ferramentas para auxiliar na organização, levantamento de requisitos e planejamento:

- Quadro 3 Objetivos.
- Quadro Kanban.
- Quadro É, Não É, Faz, Não Faz.
- Product Backlog.

---

## Tecnologias Utilizadas

Java, JavaFX, Git

### Ferramentas

- Miro
- IntelliJ IDEA
- MySQL Workbench
- GitHub

---

## Arquitetura e Dados

### MVC (Model-View-Controller)

O projeto utiliza o padrão arquitetural MVC para separar as responsabilidades da aplicação.

- **View:** responsável pela interface gráfica desenvolvida em JavaFX e pela interação com o usuário.
- **Controller:** responsável por receber as ações da View e coordenar a execução da lógica da aplicação.
- **Model:** representa os dados, entidades e regras de domínio do sistema.

### DAO (Data Access Object)

Padrão que encapsula as operações de acesso e persistência dos dados, separando a lógica de acesso aos dados da lógica de negócio da aplicação.

Cada DAO é responsável pelas operações de persistência relacionadas a um determinado Model, incluindo operações de CRUD.

---

## Estrutura de Pastas

A estrutura do projeto está organizada da seguinte maneira:

1. **View:** contém as telas e componentes da interface gráfica pelos quais o usuário irá navegar.

2. **Controller:** responsável por gerenciar as ações da aplicação e coordenar as operações realizadas sobre os Models.

3. **DAO:** responsável por encapsular as operações CRUD e de persistência relacionadas às entidades do sistema..

4. **Model:** contém as classes que representam as entidades do sistema, seus atributos, métodos e comportamentos.

5. **Enum:** contém enums utilizados para representar conjuntos predefinidos de opções do sistema, como gêneros cinematográficos:
    - Drama
    - Ficção científica
    - Comédia
    - etc.

6. **Util:** contém funções e componentes auxiliares utilizados pela aplicação.

