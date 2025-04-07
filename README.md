# 📚 DCC025-TrabalhoFinal
repositório do trabalho final da disciplina de orientação a objetos.

<h2>Sobre o projeto:</h2>
Nesse projeto, foi desenvolvido um aplicativo chamado ”BookSelf”, uma ferramenta que possibilita a criação de uma biblioteca virtual personalizada. Através dele, os usuários podem adicionar registros detalhados das suas últimas leituras, bem como acrescentar suas resenhas e notas a fim de registrar sua experiência e conclusões sobre cada obra. Com essa funcionalidade, é possível organizar suas leituras e gerenciar projetos literários de forma prática e eficiente, garantindo que você tenha uma visão clara das obras já lidas, das que estão em andamento e das que pretende explorar. 
Seu principal objetivo é oferecer uma maneira fácil, intuitiva e personalizável de acompanhar sua jornada literária e, acima de tudo, possibilitar que o sentimento despertado em você durante cada leitura nunca seja esquecido.

``` mermaid
classDiagram 

Book <|-- PersonalBook 
Review *-- Book
Status o-- PersonalBook
AdmService o-- Book
User <|-- Reader
User o-- Review
Reader o-- PersonalBook
IService <|.. LibraryService
IService <|.. LoginService
IService <|.. PersonalLibraryService
IService <|.. ReviewService
IService <|.. AdmService


class PersonalBookDTO {
    + PersonalBookDTO() : record
}

class Book {
    - name : String
    - author : String
    - ISBN : String 
    - synopsis : String 
    - pages : int 
    - genre : Genre
}

class PersonalBook {
    - status : Status
    - user : String
    - currentPage : int
}


class Genre {
    <<enumeration>>
    Fantasia
    Romance
    Ficção
    Academico
    Distopia
    Suspense
    Literatura_Juvenil
    Ficcao_Cientifica
    Misterio
    Horror
    - type : String
}

class Status {
    <<enumeration>>
    Lendo
    Lido
    Quero_Ler
    Abandonei
    - displayName : String

    + fromDisplayName() : Status
}

class Review {
    - id : String
    - username : String
    - ISBN : String
    - stars : int
    - comment : String
}

class Reader 

class User {
    - username : String
    - password : String
}

class FileManager {
    + write()
    + load() : String
    + append()
    + clear()   
}

class IService {
    <<interface>>

    + findById() : T
    + findAll() : List<T> 
    + create()
    + saveAll()
}

class AdmService {
    + findById() : Book
    + findAll() : List<Book>
    + create()
    + saveAll()
    + update()
    + addBook()
    + removeBook()
}

class LibraryService {
    + findById() : Book
    + findAll() : List<Book>
    + create()
    + saveAll()
    + getBooksByGenre : List <Book>
}

class LoginService {
    + findById() : User
    + findAll() : LIst<User>
    + create()
    + saveAll()
    + clearAll()
}

class PersonalLibraryService {
    + findById() : PersonalBookDTO ATENcAOO
    + findAll() : List<PersonalBookDTO>
    + create()
    + saveAll()
    + addToPersonalLibrary()
    + getAllAsPersonalBooks() : List<PersonalBook>
    + isOnPersonalLibrary() : boolean
    + removeFromPersonalLibrary()
    + getBooksByStatus() : List<PersonalBook>
    + getNumTotalPaginasLidas() : int
    + getNumLivrosLidos() : int
    + getGenreMaisLido() : Genre 
}

class ReviewService {
    + findById() : Review
    + findAll() : List<Review>
    + create()
    + saveAll()
    + getReviewsByISBN() : List<Review>
    + getUserReviewByISBN : Review
    + removeUserReview()
}
```
