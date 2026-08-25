package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "has a favorite coding language",
            "works remotely or hybrid",
            "has a desk setup upgrade plan",
            "has debugged a production issue",
            "uses a keyboard shortcut every day",
            "has more than 3 tabs open right now",
            "has a side project in progress",
            "prefers dark mode",
            "has a favorite developer tool",
            "has attended a tech meetup",
            "owns more than one monitor",
            "has a go-to coffee order",
            "has tried pair programming",
            "has a favorite browser extension",
            "has used AI to speed up work",
            "has a personal tech ritual",
            "has a setup for remote calls",
            "has built something with code",
            "has a laptop sticker collection",
            "has more than one email inbox",
            "has a favorite terminal command",
            "has a learning backlog for tech",
            "has a smartwatch or wearable",
            "has a strong opinion on keyboards"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
