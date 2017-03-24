# Startup Weekend Team Tracker

#### A web application that allows a Startup Weekend or hack-a-thon coordinator to track teams and their members, Current Version: 03/24/2017

#### Author: John Carr

## Description
A web application that allows a Startup Weekend or hack-a-thon coordinator to track teams and their members. This program allows coordinators to add new teams and view teams. Within a specific team page, the coordinator can add team members.

## Setup/Installation Instructions

* Clone portfolio respository from:
<http://github.com/coderknot/startup-weekend-team-tracker>
* Compile project using the <code>gradle run</code> command in a terminal
* Navigate to localhose:4567
* Provide input as indicated

## Specifications

| Behavior | Example Input | Example Output |
|----------|---------------|----------------|
| The program should create team members by instantiating a Member object | (no object) | Member |
| The program should receive and store the name of a team member | Member Name: "Chris" | Member Name: "Chris" |
| The program should return a list of all team members for a specific team | "Chris", "Megan", "Gloria" | "Chris", "Megan", "Gloria" |
| The program should create teams by instantiating a Team object | (no object) | Team |
| The program should receive and store the name of a team | Team Name: "Team TOT" | Team Name: "Team TOT" |
| The program should return a list of all teams | "Team TOT", "Team Racer" | "Team TOT", "Team Racer" |

## Known Bugs


## Support and contact details
Questions? Concerns? Suggestions?

Reach out to me via github:
<http://github.com/coderknot>

## Technologies Used
* _JAVA_
* _JUnit_
* _Gradle_
* _Spark_
* _Velocity Template Engine_
* _HTML_

## License

MIT License

Copyright (c) 2017 John Carr

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
