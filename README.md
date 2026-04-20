# Wildpack-
WildPack 🐺
An extinct animal encyclopedia built with Java Spring Boot. This is my passion project — I've always been into animals and wildlife, and when scientists brought back the Dire Wolf in 2025 I knew I had to build something around it.
WildPack lets you explore animals that vanished from Earth, learn what living animal is their closest relative today, and test your knowledge with a flashcard game.

What It Does

Browse extinct animals with full detail pages
See the living relative for every animal (ex: Dire Wolf → Gray Wolf)
Search and filter animals by name or status
Flip flashcards to test your extinction knowledge
Watch YouTube videos for each animal right on the page
Random fun fact shown on the homepage every time you load it


Tech Stack
LayerTechnologyBackendJava 17 + Spring Boot 3APIREST API — returns JSONFrontendHTML + CSS + Vanilla JavaScriptDatabaseH2 (dev) — MySQL or PostgreSQL (prod)GameVanilla JavaScript (flashcard logic)VideoYouTube iframe embedToolsVS Code + Git + GitHub

V1 Animals — 10 to Start
Extinct AnimalLiving RelativePeriodDire WolfGray Wolf / Domestic DogPleistoceneSaber-tooth CatLions, Tigers, House CatsPleistoceneWoolly MammothAfrican & Asian ElephantPleistoceneDodoPigeons & DovesHoloceneTasmanian TigerQuoll (marsupial)HoloceneCave LionAfrican LionPleistoceneGiant Ground SlothModern SlothsPleistocenePassenger PigeonMourning DoveHoloceneWoolly RhinocerosWhite & Black RhinoPleistoceneTerror BirdOstrich & EmuPaleogene

How to Run It Locally
Make sure you have Java 17 and Maven installed.
bash# Clone the repo
git clone https://github.com/YOUR-USERNAME/wildpack.git
cd wildpack

# Run the app
./mvnw spring-boot:run
Then open your browser and go to:
http://localhost:8080
The H2 database runs in memory so no setup needed — it seeds the animal data automatically on startup. The Spring Boot backend serves the REST API and the static HTML/CSS/JS files handle everything on the frontend.

How It Works
The backend is a REST API built with Spring Boot. JavaScript on the frontend fetches data from the API and renders it on the page — no page reloads needed.
Browser (HTML + CSS + JS)
        ↓  fetch("/api/animals")
Spring Boot REST API
        ↓  queries
H2 / MySQL Database

Project Structure
src/
├── main/
│   ├── java/com/wildpack/
│   │   ├── controller/
│   │   │   └── AnimalController.java   (@RestController)
│   │   ├── model/
│   │   │   ├── Animal.java             (@Entity)
│   │   │   └── AnimalStatus.java       (enum: EXTINCT, DE_EXTINCT)
│   │   ├── repository/
│   │   │   └── AnimalRepository.java   (extends JpaRepository)
│   │   └── service/
│   │       └── AnimalService.java      (@Service)
│   └── resources/
│       ├── static/
│       │   ├── index.html
│       │   ├── animals.html
│       │   ├── detail.html
│       │   ├── game.html
│       │   ├── css/
│       │   └── js/
│       ├── application.properties
│       └── data.sql

API Endpoints
MethodEndpointWhat It DoesGET/api/animalsReturns all animalsGET/api/animals/{id}Returns one animal by IDGET/api/animals/search?name=Search by nameGET/api/animals/status/{status}Filter by EXTINCT or DE_EXTINCTGET/api/animals/random-factReturns a random fun fact

Pages

/ — Homepage with hero, fun fact, and featured animals
/animals.html — Browse and search all animals
/detail.html?id={id} — Full detail page for one animal
/game.html — Flashcard game
/about.html — Project background


Why I Built This
I transitioned into software development from warehouse work and this project is personal to me. I've always loved animals and wildlife. When the Dire Wolf came back in 2025 I thought — there should be a clean, modern place that tells that story alongside the rest of extinction history. So I built it.
This is my passion project from the Java cohort at Zip Code Wilmington.

Status
🚧 Currently in development — V1 targeting end of cohort

From the warehouse floor to the pack. 🐺
