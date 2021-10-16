# Fixes for Assignment 1

## Fixes from feedback
### Model

- Should RoundNumber and Score be an int (like EInt) instead of java.lang.Integer?
  - Chose **not** to change them to an int, as their ExtendedMetaData validation stopped working (maybe because an int automatically gets a default vaule of 0 in the generated code).

## Other fixes (not from feedback)
### Model
- The `form` attribute of the `Statistic` class is changed to be not unique. This makes it possible for a team to have multiple wins, losses or draws during the last six matches.
### Instance
- A new model instance `Tournaments.ft` has been made in `ft.instances/instances/`. It combines the two previously made instances (`NorwegianTournaments.ft` and `EnglishTournaments.ft`). The new instance can be used to run the transformation.
