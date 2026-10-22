# CyberRaksha — Cyber Awareness Community Service Project

**Tagline:** Protect Yourself. Protect Everyone.

A Java Spring Boot web application MVP for cyber-scam awareness, multilingual learning, safe quiz practice, and official emergency resources.

## Included in this starter MVP

- Responsive home page and navigation
- Language selector for English, Telugu, Tamil, Hindi, Malayalam, and Kannada (navigation and key interface messages translated; scam article and quiz content currently authored in English and should be translated/reviewed before public launch)
- Cyber-scam learning library with six topics
- Five-question cyber-safety quiz with scoring and explanations
- Emergency Help Centre with India cybercrime resources
- Spring Boot + Thymeleaf + MySQL project structure

## Requirements

- JDK 21
- Maven 3.9+
- MySQL 8+
- Eclipse IDE (or IntelliJ / VS Code)

## Run locally

1. Install and start MySQL.
2. Create the database (or let the configured JDBC URL create it if your MySQL account has permission):

   ```sql
   CREATE DATABASE cyberraksha CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
   ```

3. Set the database credentials. The defaults are username `root` and an empty password; override them for your local setup:

   **macOS/Linux:**
   ```bash
   export DB_USERNAME=root
   export DB_PASSWORD='your_mysql_password'
   ```

4. From this project folder run:

   ```bash
   mvn spring-boot:run
   ```

5. Open `http://localhost:8080`.

If you import into Eclipse: **File → Import → Maven → Existing Maven Projects**, select the extracted project directory, then run `CyberRakshaApplication.java` as a Java application after configuring MySQL.

## Routes

- `/` — Home
- `/learn` — Scam awareness library
- `/learn/{slug}` — Individual guide
- `/games` — Cyber safety quiz
- `/emergency` — Emergency resources

Choose a language from the header. Spring's locale resolver uses the `lang` query parameter and stores the choice in the session.

## Team split (four members)

1. Awareness content and six-language review
2. Quiz/game questions, scoring, and user testing
3. Spring Boot backend, database, and integration
4. UI, emergency resources, community survey, documentation, and deployment

All members should review and test the integrated application.

## Important limitations before public deployment

- This is an MVP, not a production-ready emergency or complaint-filing system.
- Quiz scores are calculated per submission and are not persisted to MySQL yet. The included MySQL dependency and configuration prepare the project for the next database-backed iteration.
- Scam article text and quiz scenarios are currently English-only. The interface labels are translated; have competent native speakers translate and verify all safety-critical content in all six languages before a public release.
- Verify helpline numbers, official links, and service availability against official government sources before launch. The app does not file complaints on the user's behalf.
- Add automated tests, accessibility checks, security review, logging, and production database migrations before deployment.
- Do not collect OTPs, PINs, passwords, bank credentials, or unnecessary personal information.

## Suggested next implementation steps

1. Persist scam articles, translations, questions, and emergency contacts in MySQL using JPA entities and repositories.
2. Add an authenticated admin dashboard for editing approved content.
3. Translate all lessons and game content into the six supported languages.
4. Add automated controller/service tests and a community impact reporting module.
