<h1>Ufo Breaker🧱</h1>



    
<div align="center">
<h2>[2023] UFO BREAKER 🚙</h2>
The scope of this project encompasses the investigation and implementation of an online platform aimed at college students, enabling them to reserve and utilize designated nap spots or dedicated spaces within the university campus parking lot. 
</div>

## Content
  - [Introduction](#Introduction)
  - [Project Introduction](#Project-Introduction)
  - [Class Diagram](#Data-Flow)
  - [Project Desc](#Project-Desc)
  - [Youtube Demo](#Youtube-Demo)
  - [Reflection](#Reflection)
  - [Future Enhancement](#Future-Enhancement)


## Introduction
- Project Title: UFO breaker 🤖
- Project Timeline: 07.2023-08.2023
- Project Stack: Scala, Scene Builder  
- Project Member: Hong Woo Jin

## Project Introduction

The timeless arcade classic, Brick Breaker, presents players with the task of maneuvering a paddle to guide a
bouncing ball, strategically aiming to dismantle a configuration of bricks positioned at the upper section of the
display. Through adept manipulation of the paddle's horizontal motion, players strive to uphold ball continuity,
precisely rebound it off the paddle to strike and eliminate bricks, and ultimately clear the screen. The game's
fusion of physics-oriented ball kinetics, paddle mastery, and calculated brick precision engenders an immersive
encounter wherein players must foresee the ball's trajectory, adjust their paddle's orientation, and navigate
advancing levels of escalating intricacy, all while pursuing elevated point achievements.
Throughout the developmental journey of the Brick Breaker game, I harnessed the potential of a sophisticated
technology stack, utilizing instruments that have gained pivotal importance in contemporary software
development. The core of this process revolved around my engagement with Scene Builder, an exceptionally
user-friendly visual design instrument seamlessly integrated with JavaFX. The drag-and-drop framework within
Scene Builder emerged as an indispensable asset, allowing me to rapidly construct intricate user interfaces
without the necessity of intricate coding. The outcome was an interface that adroitly merges practical
functionality with aesthetic allure.
Furthermore, my execution significantly profited from the grace of ScalaFX, a specialized language that
harmoniously integrates with JavaFX in the domain of the Scala programming language. This tactical synergy
empowered me to fabricate interactive user interfaces, execute seamless animations, and shape visually dynamic
components with the inherent grace and lucidity of the Scala language. The consequence was an elevated
developmental journey that metamorphosed my foundational code from utilitarian to artistic.
To expedite my advancement further, I seamlessly integrated the Scala Build Tool (SBT) into my procedural
framework. SBT proved itself as an adaptable companion, meticulously managing critical facets of my project,
encompassing tasks like compilation, testing, and management of dependencies. This integration refined my
developmental process, augmenting efficiency and ensuring a methodically organized project architecture.
The culmination of Scene Builder's visual finesse, ScalaFX's expressive potential, and SBT's optimization of
efficiency yielded a Brick Breaker game that encapsulated the intrinsic essence of the original classic while
embracing contemporary methodologies of development. This fusion not only empowered me to engender an
enthralling gaming experience but also furnished invaluable insights into the harmonious collaboration of
cutting-edge tools in the sphere of contemporary software crafting.

## Class Diagram

![image](https://github.com/woojinhong/UfoBreaker/assets/61961800/52c3bfcc-f57f-4b08-8481-ca7da1215c35)



## Project Desc


|![image](https://github.com/woojinhong/UfoBreaker/assets/61961800/bcd72173-6579-467c-a8b7-e0d103747f7a)|
|:---:|
|Start Page|

The green button indicates a method when user wants to play background music.
- The yellow play button indicates a method when user wants to access to play the game. It is an event
handler which triggers when the imageview is clicked. As Soon as the play button is clicked the
background music stops and shows the game board view.

![image](https://github.com/woojinhong/UfoBreaker/assets/61961800/f099372b-2d22-4dcd-8350-a729537b7f4a)
|:---:|
|Tool Bar|

The given XML code establishes a top-level menu bar within the application's layout. This menu bar comprises
multiple dropdowns (File, Edit, Help) housing associated commands. These commands are interconnected with
operations carried out in the RootController class of the application. This menu bar grants users entry to diverse
functions, including shutting down the application, obtaining assistance, and potentially executing editing actions
(such as removal) within your Brick Breaker application


![image](https://github.com/woojinhong/UfoBreaker/assets/61961800/abfb004a-2193-4250-8218-61463597b236)
|:---:|
|Game Board|

The supplied FXML code illustrates the arrangement of the gaming area in your Brick Breaker application. It
outlines the visual components and their characteristics within this gaming area, like the oval, ball, and
bricks(UFO).
The gamer shifts a PADDLE horizontally to strike a BALL🎱. The primary goal of the game is to eradicate all the
BRICKS positioned at the upper part of the display by impacting them using the BALL. However, in case the
ball collides with the lower CONTAINMENT, the player is defeated and the game concludes! To emerge
victorious, it is imperative to eliminate all the BRICKS(indicates UFO in the game :)).

![image](https://github.com/woojinhong/UfoBreaker/assets/61961800/440da8a3-98c8-4638-aeb0-bdf09e77821b)
|:---:|
|Time Count|

The notion of "elapsed time" is employed to monitor the duration a player has spent engaging in the game. It
gauges the time span between the initiation of the game and occurrences, such as accomplishing the game, or a
distinct move executed by the player. The "elapsed time" attribute introduces an extra facet to the game, enabling
players to vie for swifter achievement times or to assess their advancement.


|Game Reset|

The essential aspect of the gameplay encounter is the "game reset" capability. This empowers players to
commence anew subsequent to finishing a game, encountering defeat. The intent behind the "game reset"
attribute is to restore all variables, positions, and conditions linked to the game to their original states, affording
players a renewed beginning.

## Youtube Demo
https://www.youtube.com/watch?v=QagXLLdnLdU




## Reflection
Embarking on the creation of the Brick Breaker game has been a captivating and enlightening expedition. As I
delved into the source code, I garnered a more profound comprehension of gaming mechanisms, event
management, and graphical user interfaces within the context of ScalaFX and JavaFX. The endeavor underscores
how the amalgamation of Scene Builder, ScalaFX, and diverse design patterns can yield an interactive and
enjoyable gaming encounter.
One of the aspects that resonated with me was the methodical arrangement of the code. The segregation of
responsibilities via classes like Brick, Ball, and Oval, each implementing the GameObject trait, exemplifies the
potency of object-oriented design. This approach permits modular adjustments and insertions to the game
components, fostering code maintainability and expandability.
The integration of animation via the AnimationTimer in the BoardController constitutes a pivotal facet of the
game's functionality. The fluid trajectory of the ball and the interactive feedback to player input underscore the
dynamic capabilities of ScalaFX. It also underscores how timing and update mechanisms are indispensable in
preserving a seamless and captivating gameplay involvement.
The utilization of FXML files, particularly the Welcome.fxml and Board.fxml files, showcases the prowess of
declarative UI design. The XML structure adeptly delineates the configuration of UI elements, and the fusion
with the corresponding controllers allows for a lucid demarcation between logic and presentation. The dropdown
menus, encompassing the "File," "Edit," and "Help" alternatives, equip users with fundamental capabilities such
as game restart or information access.
The infusion of sound effects and background music via the MediaPlayer augments the game's ambience. The
implementation of sound cues upon ball-brick collisions and the ability to toggle background music introduces
an immersive facet to the gameplay involvement, heightening player engagement.
Upon contemplation of this undertaking, I've come to recognize that game development is a creative pursuit that
necessitates a fusion of programming acumen, design principles, and considerations for user experience. It has
also underscored the significance of thorough testing and user input to ensure a seamless and gratifying
experience for players. This project has furnished me with invaluable insights into constructing interactive
applications and has sparked my curiosity in venturing further into the realm of game development.
In summation, the crafting of the Brick Breaker game has been an enlightening odyssey that has amplified my
coding aptitude and unveiled the expansive domain of game development. This endeavor has deepened my
admiration for the intricacies of conceiving, coding, and refining games, and I eagerly anticipate exploring more
imaginative undertakings in the times ahead.


## Future Enhancement
Throughout the progression of this undertaking, I also came across a few aspects that could be enhanced. Firstly,
there were certain aspects that were either overlooked or had room for refinement in terms of adjusting the game's
challenge level or incorporating supplementary functionalities. By introducing features such as a broader array
of brick variations or refining the difficulty settings for different game levels, the game's depth and allure could
be heightened.
Secondly, I am of the opinion that more contemplation regarding the design of the user interface is warranted.
By elevating elements like the imagery in the game's playing arena or refining the hues and aesthetics of user
interface elements, the game's visual charm could be elevated. Furthermore, segments like the game's initial
screen or the pop-up window for game over scenarios could be tailored to offer a more user-centric experience.
Lastly, there exists a chance to elevate the code's lucidity and structure. While the present code is operationally
effective, there's room to enhance its comprehensibility and ease of upkeep by adopting more explicit names for
variables and functions, incorporating supplementary explanatory comments, and segmenting the code into
smaller, more purposeful modules.
These areas that warrant enhancement should be considered when advancing this project in the future or when
commencing other game-oriented projects. Ultimately, the continual pursuit of improvement and the ongoing
acquisition of knowledge will lead to the further refinement of skills in game development.

