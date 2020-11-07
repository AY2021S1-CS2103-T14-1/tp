---
layout: page
title: Project Portfolio Page
---

## Project: FaculType

FaculType is a desktop app for managing faculty members and their modules, optimized for use via a Command Line Interface (CLI) while still having the benefits of a Graphical User Interface (GUI) created with JavaFX. It is written in Java, and has about 11 kLoC.

Given below are my contributions to the project.

* **New Feature**: Added the ability to unassign a contact from modules.
  * What it does: allows the user to unassign a contact from modules specified.
  * Justification: This feature improves the product significantly because instructors may retire or assigned to teach another modules. Unassign makes it easier to update the assignment.
  * Highlights: This enhancement required an in-depth analysis of design alternatives because there are a lot of possible command combination. It also required an understanding of existing assign feature. Unassign can be used to unassign specified contact from specified modules or unassign the contact from all modules it is assigned to, depending on the command format.
  * Credits: *{mention here if you reused any code/ideas from elsewhere or if a third-party library is heavily used in the feature so that a reader can make a more accurate judgement of how much effort went into the feature}*
  
* **New Feature**: Added the ability to unassign all contacts from all modules.
  * What it does: allows the user to unassign all contacts from all modules in FaculType.
  * Justification: This feature improves the product significantly to ease major changes in the teaching staff structure. It is also used by cclear to delete all assignment prior to deleting all contacts to avoid inconsistency or invalid data.
  * Highlights: This enhancement required a rigid implementation because it affects another feature in the FaculType.
  * Credits: *{mention here if you reused any code/ideas from elsewhere or if a third-party library is heavily used in the feature so that a reader can make a more accurate judgement of how much effort went into the feature}*

* **New Feature**: Added the ability to add modules.
  * What it does: allows the user to add more modules to FaculType.
  * Justification: This feature improves the product significantly because university curriculum is dynamic. Modules might be added or updated to adjust to the current curriculum. 
  * Highlights: This feature required an understanding of existing Module, UniqueModuleList, and Model class. It needs a lot of checking to ensure there are no duplicate modules or modules with invalid format.
  * Credits: *{mention here if you reused any code/ideas from elsewhere or if a third-party library is heavily used in the feature so that a reader can make a more accurate judgement of how much effort went into the feature}*

* **Code contributed**: [RepoSense link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=florenciamartina)

* **Enhancements to existing features**:
  * Updated all one-word commands to disallow arguments [\#180](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/180)
  * Wrote additional tests for existing features to increase coverage (Pull requests [\#64](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/64), [\#114](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/114), [\#115](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/115), [\#135](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/135), [\#180](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/180))
  * Increased font size to increase readability [\#147](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/147) 

* **Documentation**:
  * User Guide:
    * Added documentation for the features `addmod`, `findmod`, `assign`, `mclear`, and `cclear` [\#36](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/36), [\#90](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/90)
    * Update existing documentation of features `clear`: [\#90](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/90)
  * Developer Guide:
    * Added NFRs. [\#29](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/29)
    * Updated glossary and user stories. [\#92](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/92), [\#241](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/241)
    * Added implementation details of the `unassign` and `unassignall` feature. [\#129](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/129), [\#230](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/230)

* **Community**:
  * PRs reviewed (with non-trivial review comments): [\#61](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/61), [\#89](https://github.com/AY2021S1-CS2103-T14-1/tp/pull/89)
  * Reported bugs and suggestions for other teams in the class (examples: [1](https://github.com/florenciamartina/ped/issues/2), [2](https://github.com/florenciamartina/ped/issues/7), [3](https://github.com/florenciamartina/ped/issues/8), [4](https://github.com/florenciamartina/ped/issues/10))

* **Tools**:
  * Integrated a test coverage plugin (CodeCov) to the team repo

* _{you can add/remove categories in the list above}_
