package com.nickbafia.portfolio_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProjectController {
    private static final String TITLE = "title";
    private static final String ID = "id";
    private static final String DESCRIPTION = "description";
    private static final String DATE = "date";
    private static final String GITHUB = "github";
    private static final String LANG = "languages";

    @GetMapping("/api/projects")
    public List<Map<String, String>> getProjects() {

        return List.of(
                Map.of(
                        ID, "2",
                        TITLE, "Revaro - Automotive Discovery Platform",
                        DESCRIPTION, "Revaro is a web platform for discovering, organizing, and managing automotive events. Users can create car meets, cruises, shows, and track days, RSVP to events, participate in discussions, and help grow a centralized community-driven hub for car enthusiasts.",
                        DATE, "2026-07-07",
                        GITHUB, "https://github.com/ISUNick/Revaro",
                        LANG, "HTML, Java, CSS, JavaScript"
                ),
                Map.of(
                        ID, "2",
                        TITLE, "Football League Simulator",
                        DESCRIPTION, "Developed a Java football league simulator featuring season scheduling, playoff brackets, team progression, and historical stat tracking. Includes multi-season simulations with persistent records, analytics, and structured output formatting.",
                        DATE, "2026-03-16",
                        GITHUB, "https://github.com/ISUNick/FootballLeague",
                        LANG, "Java"
                ),
                Map.of(
                        ID, "3",
                        TITLE, "Sorting Algorithm Analyzer",
                        DESCRIPTION, "Implements and compares four sorting algorithms (Selection, Insertion, Merge, QuickSort) on 2D integer points to compute the median coordinate point. Supports file and random input, uses OOP design with comparators, and measures execution time for performance analysis.",
                        DATE, "2026-02-14",
                        GITHUB, "https://github.com/ISUNick/SortingAlgorithm",
                        LANG, "Java"
                ),
                Map.of(
                        ID, "4",
                        TITLE, "Portfolio Website (this one)",
                        DESCRIPTION, "This website demonstrates full-stack application design by connecting a Spring Boot backend to a dynamic frontend interface. It handles API-driven project rendering, client-side sorting, static asset management, form submission workflows, responsive design challenges, and scalable content updates without requiring frontend code changes when new projects are added.",
                        DATE, "2026-05-22",
                        GITHUB, "https://github.com/ISUNick/PortfolioWebsite",
                        LANG, "Java, HTML, CSS, Spring Boot, JavaScript"
                ),
                Map.of(
                        ID, "5",
                        TITLE, "ISP Business Market Simulation",
                        DESCRIPTION, "Java simulation modeling ISP market dynamics on a 2D grid. Each cell represents a customer type (Reseller, Empty, Casual, Outage, Streamer) and evolves over 12 cycles based on neighbor rules. Supports file or seeded random initialization and computes average casual customer profit percentage over time.",
                        DATE, "2026-02-23",
                        GITHUB, "https://github.com/ISUNick/ISPBusiness",
                        LANG, "Java"
                ),
                Map.of(
                        ID, "6",
                        TITLE, "Bus Route Optimization Simulator",
                        DESCRIPTION, "This program simulates a bus with a set number of seats and stops, tracking passengers boarding and leaving. It counts stranded passengers and violations when more try to get off than are on. The bus supports looping and backing routes, and service can be turned on or off at any stop.",
                        DATE, "2025-09-15",
                        GITHUB, "https://github.com/ISUNick/XyBus",
                        LANG, "Java"
                ),
                Map.of(
                        ID, "7",
                        TITLE, "Snooker Game Logic Simulator",
                        DESCRIPTION, "Java class that manages scoring, frames, turns, fouls, and betting in a snooker match. Fully tested to handle match flow, tiebreaks, and frame progression for two players. Implements complete game logic with concise, readable structure and Javadoc documentation.",
                        DATE, "2025-10-24",
                        GITHUB, "https://github.com/ISUNick/Snooker",
                        LANG, "Java"
                )
        );
    }
}
