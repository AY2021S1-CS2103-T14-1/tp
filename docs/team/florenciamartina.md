---
layout: page
title: Project Portfolio Page
---

## Project: FaculType

FaculType is a desktop app for managing faculty members and their modules, optimized for use via a Command Line Interface (CLI) while still having the benefits of a Graphical User Interface (GUI) created with JavaFX. It is written in Java, and has about 11 kLoC.

Given below are my contributions to the project.

* **New Feature**: Added the ability to unassign a contact from modules.
  * What it does: allows the user to undo all previous commands one at a time. Preceding undo commands can be reversed by using the redo command.
  * Justification: This feature improves the product significantly because a user can make mistakes in commands and the app should provide a convenient way to rectify them.
  * Highlights: This enhancement affects existing commands and commands to be added in future. It required an in-depth analysis of design alternatives. The implementation too was challenging as it required changes to existing commands.
  * Credits: *{mention here if you reused any code/ideas from elsewhere or if a third-party library is heavily used in the feature so that a reader can make a more accurate judgement of how much effort went into the feature}*
  
* **New Feature**: Added the ability to unassign all contacts from all modules.


* **New Feature**: Added the ability to add modules.

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=florenciamartina)

* **Project management**:
  * Managed releases `v1.3` - `v1.5rc` (3 releases) on GitHub

* **Enhancements to existing features**:
  * Updated all one-word commands to disallow arguments [\#180](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/180)
  * Wrote additional tests for existing features to increase coverage from 88% to 92% (Pull requests [\#36](), [\#38](), [\#135]())

* **Documentation**:
  * User Guide:
    * Added documentation for the features `addmod`, `findmod`, `assign`, `mclear`, and `cclear` [\#36](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/36), [\#90](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/90)
    * Update existing documentation of features `clear` to `reset`: [\#90](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/90)
  * Developer Guide:
    * Added NFRs. [\#29](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/29)
    * Updated glossary and user stories. [\#92](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/92)
    * Added implementation details of the `unassign` and `unassignall` feature. [\#129](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/129)

* **Community**:
  * PRs reviewed (with non-trivial review comments): [\#12](), [\#32](), [\#19](), [\#42]()
  * Contributed to forum discussions (examples: [1](), [2](), [3](), [4]())
  * Reported bugs and suggestions for other teams in the class (examples: [1](), [2](), [3]())
  * Some parts of the history feature I added was adopted by several other class mates ([1](), [2]())

* **Tools**:
  * Integrated a third party library (Natty) to the project ([\#42]())
  * Integrated a new Github plugin (CircleCI) to the team repo

* _{you can add/remove categories in the list above}_
