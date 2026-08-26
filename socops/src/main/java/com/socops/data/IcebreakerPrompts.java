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
            "Uses dark mode always",
            "Has a mechanical keyboard",
            "Tabs over spaces",
            "Spaces over tabs",
            "Has 10+ browser tabs open",
            "Uses vim or neovim",
            "Has renamed a var to 'temp2'",
            "Debugs with print statements",
            "Has blamed the compiler",
            "Knows a shortcut nobody else does",
            "Has broken prod on a Friday",
            "Drinks coffee while coding",
            "Has a rubber duck on their desk",
            "Uses VS Code",
            "Has a TODO that's still there",
            "Prefers CLI over GUI",
            "Copy-pasted from Stack Overflow today",
            "Can touch-type without looking",
            "Has rage-quit a merge conflict",
            "Has a remote work setup at home",
            "Play rock-paper-scissors with neighbor",
            "Has written code outside work hours",
            "Uses multiple monitors",
            "Has a custom terminal setup"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
