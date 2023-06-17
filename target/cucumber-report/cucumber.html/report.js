$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("virgingames.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage functionality",
  "description": "As user I want to check top menu tab and login tab functionality",
  "id": "homepage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6366626000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to game page when you click on menu tab",
  "description": "",
  "id": "homepage-functionality;user-should-navigate-to-game-page-when-you-click-on-menu-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I accepted cookie",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on All games Tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I get online slots text",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify \u0027online slots\u0027 text",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on \u00273 Lucky Rainbow\u0027 game",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I navigate to game page",
  "keyword": "Then "
});
formatter.match({
  "location": "VirginGamesSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 176310800,
  "status": "passed"
});
formatter.match({
  "location": "VirginGamesSteps.iAcceptedCookie()"
});
formatter.result({
  "duration": 271742900,
  "status": "passed"
});
formatter.match({
  "location": "VirginGamesSteps.iClickOnAllGamesTab()"
});
formatter.result({
  "duration": 306858800,
  "status": "passed"
});
formatter.match({
  "location": "VirginGamesSteps.iGetOnlineSlotsText()"
});
formatter.result({
  "duration": 2050295600,
  "status": "passed"
});
formatter.match({
  "location": "VirginGamesSteps.iVerifyOnlineSlotsText()"
});
formatter.result({
  "duration": 44972100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 12
    }
  ],
  "location": "VirginGamesSteps.iClickOnLuckyRainbowGame(int)"
});
formatter.result({
  "duration": 403126600,
  "status": "passed"
});
formatter.match({
  "location": "VirginGamesSteps.iNavigateToGamePage()"
});
formatter.result({
  "duration": 24500,
  "status": "passed"
});
formatter.after({
  "duration": 718445100,
  "status": "passed"
});
formatter.before({
  "duration": 3895110000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should navigate to login verify page successfully",
  "description": "",
  "id": "homepage-functionality;user-should-navigate-to-login-verify-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I am on the  homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I accept cookie on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Login link",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should navigate to verify page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 98700,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iAcceptCookieOnHomepage()"
});
formatter.result({
  "duration": 344666400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 347420500,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.iShouldNavigateToVerifyPageSuccessfully()"
});
formatter.result({
  "duration": 42428700,
  "status": "passed"
});
formatter.after({
  "duration": 740296100,
  "status": "passed"
});
});