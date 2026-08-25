# Copilot Instructions

## Design guide

Keep the app feeling warm, social, and relaxed. The experience should feel like a cozy gathering rather than a stark productivity tool.

### Core visual direction
- Use a warm neutral palette built around cream, terracotta, muted gold, and soft sage.
- Favor layered surfaces, soft shadows, and subtle blur to create depth without looking glossy or overdesigned.
- Keep type readable and comfortable: a confident sans-serif for headings and a softer serif or editorial accent for the brand feel.
- Use rounded corners and gentle contrast to make the interface feel approachable and welcoming.

### Recommended palette
- Background: warm cream / parchment tones
- Primary action: terracotta or clay red
- Secondary warmth: soft gold and honey accents
- Success states: sage green with subtle light highlight tones
- Text: warm charcoal and muted brown, not stark black

### Layout principles
- Prioritize whitespace and breathing room over crowded dense layouts.
- Keep the board centered and unobstructed; the game should feel calm and easy to scan.
- Use soft borders and low-contrast dividers to keep the interface light and friendly.
- The lobby should feel like a welcoming invitation, not a technical form.

### Interaction details
- Buttons should feel tactile with gentle hover and active transitions.
- Selected tiles should read as clearly marked without becoming aggressively bright.
- Victory states should be celebratory but still consistent with the cozy tone.

### Constraints
- Preserve the 5x5 board and the free center behavior unless explicitly requested otherwise.
- Keep gameplay logic untouched when changing the UI.
- Prefer utility classes in the CSS stylesheet before adding custom CSS.
- Keep Thymeleaf markup simple, readable, and stable so the JS state flow remains intact.

### Acceptance check
When making UI changes, confirm that the design remains:
- cozy and welcoming
- readable at a glance
- consistent with the brand palette
- non-disruptive to board interaction and win detection
