🌐 [Português (BR)](README.pt_BR.md) | [Español](README.es.md)

# 🎲 Soc Ops

**Break the ice. Build the network. Bingo.**

Soc Ops turns any in-person mixer into a Social Bingo game — mingle, find people who match the prompts on your card, and shout bingo the moment you get 5 in a row.

Built with Java 21 + Spring Boot, this repo doubles as a hands-on lab for using **GitHub Copilot's Agent Mode** to design, extend, and test a real application.

📚 **[View Lab Guide](workshop/GUIDE.md)** · 🚀 [Quick Start](#-quick-start) · 🛠️ [Tech Stack](#%EF%B8%8F-tech-stack)

---

## ✨ Why Soc Ops?

- 🧩 **Instant icebreaker** — a classic 5x5 bingo board, generated fresh for every game
- 🎯 **Center free space** — always in play, no exceptions
- ⚡ **Lightweight stack** — Spring Boot + Thymeleaf, no heavy frontend build step
- 🤖 **Copilot playground** — a guided workshop for agentic coding with real features to ship

## 🚀 Quick Start

```bash
git clone <this-repo-url>
cd copilot-dev-days-fabiano/socops
./mvnw spring-boot:run
```

Then open [http://localhost:8080](http://localhost:8080) and start playing.

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java 21 |
| Framework | Spring Boot 3.4 |
| Templating | Thymeleaf |
| Build | Apache Maven (wrapper included) |

---

## 📚 Lab Guide

| Part | Title |
|------|-------|
| [**00**](workshop/00-overview.md) | Overview & Checklist |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering |
| [**02**](workshop/02-design.md) | Design-First Frontend |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development |

> 📝 Lab guides are also available in the [`workshop/`](workshop/) folder for offline reading.

---

## ✅ Prerequisites

- [Java 21 JDK](https://adoptium.net/) or higher
- [Apache Maven 3.9+](https://maven.apache.org/) (or use the included Maven Wrapper)

## 🔨 Build

```bash
cd socops
./mvnw clean package
```

## 🧪 Test

```bash
cd socops
./mvnw test
```

---

🚢 Deploys automatically to GitHub Pages on push to `main`.
