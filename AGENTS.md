# AGENTS

## Mandatory development checklist

Before considering work complete, verify all of the following:

- [ ] Lint/format checks are clean or not applicable
- [ ] `cd socops && ./mvnw clean package` succeeds
- [ ] `cd socops && ./mvnw test` succeeds

## Project snapshot

This is a Java 21 Spring Boot app for a social bingo mixer called Soc Ops.

- App entry: [socops/src/main/java/com/socops/SocOpsApplication.java](socops/src/main/java/com/socops/SocOpsApplication.java)
- Core logic: [socops/src/main/java/com/socops/service/BoardAssembler.java](socops/src/main/java/com/socops/service/BoardAssembler.java)
- HTTP layer: [socops/src/main/java/com/socops/web/BingoRestController.java](socops/src/main/java/com/socops/web/BingoRestController.java)
- Frontend: [socops/src/main/resources/templates](socops/src/main/resources/templates), [socops/src/main/resources/static/css/app.css](socops/src/main/resources/static/css/app.css)

## Working rules

- Keep changes small and focused.
- Prefer static pure logic for board generation and win detection.
- Preserve the 5x5 grid and center-free-cell behavior unless explicitly asked to change it.
- Use utility classes in [socops/src/main/resources/static/css/app.css](socops/src/main/resources/static/css/app.css) before adding custom CSS.
- Keep Thymeleaf templates simple and readable.
- Update tests when logic changes.

## Run commands

- Start app: `cd socops && ./mvnw spring-boot:run`
- Test: `cd socops && ./mvnw test`
- Package: `cd socops && ./mvnw clean package`

## References

- [README.md](README.md)
- [workshop/GUIDE.md](workshop/GUIDE.md)
- [workshop/01-setup.md](workshop/01-setup.md)
- [workshop/02-design.md](workshop/02-design.md)
- [workshop/03-quiz-master.md](workshop/03-quiz-master.md)
- [workshop/04-multi-agent.md](workshop/04-multi-agent.md)
- [.github/instructions/frontend-design.instructions.md](.github/instructions/frontend-design.instructions.md)
- [.github/instructions/css-utilities.instructions.md](.github/instructions/css-utilities.instructions.md)
