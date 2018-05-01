{:title "Puzzle 2"
 :layout :puzzle
 :introText "Playing against burn, in a post-sideboard game where you expect that they have brought in hate. It's our second turn, and we've shuffled off a ponder and drawn Duress. Your opponent lost to a Laboratory Maniac Game 1 and as a result they've decided to play a Grim Lavamancer instead of continuing to apply pressure, giving you a window of opportunity. The Grim Lavamancer has summoning sickness. Note that your deck includes Ideas Unbound, and that your single copy of Act on Impulse is in hand."
 :oppCards [ "red_elemental_blast" "lightning_bolt" "fireblast" "unknown" ]
 :ourCards [ "lions_eye_diamond" "doomsday" "act_on_impulse" "dark_ritual" "dark_ritual" "conjurers_bauble" "duress" ]
 :oppLife 20
 :ourLife 19
 :oppGraveyard [ ]
 :ourGraveyard [ ]
 :oppExile [ ]
 :ourExile [ ]
 :oppLibraryRevealed [ ]
 :oppLibraryCards 50
 :ourLibraryRevealed [ ]
 :ourLibraryCards 50
 :ourZone1Untapped [ "underground_sea" ]
 :ourZone1Tapped [ ]
 :ourZone2Untapped [ ]
 :ourZone2Tapped [ ]
 :ourZone3Untapped [ ]
 :ourZone3Tapped [ ]
 :ourZone4Untapped [ ]
 :ourZone4Tapped [ ]
 :ourZone5Untapped [ ]
 :ourZone5Tapped [ ]
 :oppZone1Untapped [ "mountain" ]
 :oppZone1Tapped [ "mountain" ]
 :oppZone2Untapped [ "grim_lavamancer" ]
 :oppZone2Tapped [ ]
 :oppZone3Untapped [ ]
 :oppZone3Tapped [ "monastery_swiftspear" ]
 :oppZone4Untapped [ ]
 :oppZone4Tapped [ ]
 :oppZone5Untapped [ ]
 :oppZone5Tapped [ ]
 :page-index 
 :navbar? false
 :home? false
 :author "Robert"}

The solution requires you to play the Duress to get rid of the Red Elemental Blast, and to also have mana available to pay for a Gitaxian Probe with mana instead of life to avoid dying to the Bolt and Fireblast.  If we had AoI available we could have created a pile of AoI, LED, LED, BW, (Anything) which would hit for 20 damage, which in this case would have been enough, but this example illustrates a couple strengths of including IU in your list.


| Action | State Notes |
| ------------------- | -------------------------------- |
| Cast Dark Ritual | BBB, Storm = 1 |
| Cast Duress | BB, Storm = 2, Take Red Elemental Blast |
| Cast Dark Ritual | BBBB, Storm = 3 |
| Cast Conjurer's Bauble | BBB, Storm = 4 |
| Cast LED | Storm = 5 |
| Cast Doomsday | Storm = 6, Life = 9, Pile: IU, LED, LED, GP, BW |
| Crack LED for UUU | UUU |
| Activate CB | Draw IU |
| Cast IU | U, Storm = 7, Draw: LED, LED, GP |
| Cast both LEDs | Storm = 9 |
| Cast GP, paying U, Crack LEDs for RRRBBB | RRRBBBB, Storm = 10, Draw BW |
| Cast BW | Storm = 11, RBBBB, Get ToA |
| Cast ToA | 22 Damage, Lethal |

