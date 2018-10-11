{:title "Back to the Basics"
 :layout :page
 :page-index 01
 :navbar? false
 :home? false
 :author "Doishy, d8dk32"}

This section explains the basic Doomsday piles that attempt to end the game
directly with a lethal Tendrils of Agony. Fortunately, these piles will also be
the piles that you will execute most frequently and likely win most of your
games with.

There will however, be times where you will build piles that win with Laboratory
Maniac, or build up a higher storm count with a Time Spiral (it's old tech but it still
checks out) or double-Doomsday pile, or build a pile that plays around 
Pyroblast on one of your draw spells, or even optimize for the highest
probability of being successful against a Surgical
Extraction in your opponent's hand.

Before this becomes too intimidating, let's first consider the most simple
Doomsday piles. And since this is the starting point for reading about Doomsday
piles in general, we will first explain a bit about the notation that we use
when writing down piles.

## Notation

| Shorthand | Cardname           |
| --------- | ------------------ |
| AoI       | Act on Impulse     |
| BS        | Brainstorm         |
| BW        | Burning Wish       |
| CB        | Conjurer's Bauble  |
| DD        | Doomsday           |
| DR        | Dark Ritual        |
| IC        | Infernal Contract  |
| IU        | Ideas Unbound      |
| LED       | Lion's Eye Diamond |
| LM        | Laboratory Maniac  |
| LP        | Lotus Petal        |
| P         | Ponder             |
| SW        | Street Wraith      |
| TW        | Three Wishes       |
| ToA       | Tendrils of Agony  |

Mana costs are represented as follows:  
W White - U Blue - B Black - R Red - G Green  
1 one generic mana  
BBB means three black mana  
1UU means two blue mana and one generic mana  
X means a variable amount of any generic mana

-----------

Consider the following example of a Doomsday pile in this notation:

```
SW in hand.
-> IU, LED, P, LED, BW(ToA)                BBB+UUU (6)   7 Storm
```

This means that IU is the top card and BW is the bottom card. BBB+UUU represents
the mana cost, (6) is the total converted mana cost required to complete the
pile. 8 Storm represents the amount of storm that executing this pile will
generate, this includes the Doomsday you've cast to create this pile as well as
the initial cantrip (if applicable) and the Tendrils of Agony (including the non-copy original
spell) at the end of the pile. The original Tendrils is included for simplicity,
because we simply count to ten if we want to cause 20 lifeloss. 

## Basic Doomsday Piles

The Doomsday piles that we will explain here are all based on using either Ideas
Unbound, Infernal Contract or Act on Impulse as the big draw spell. 
We will first consider the single cantrip piles.

There are some key rules you can use to help remember things like storm count.
If the intended pile is meant to win without passing the turn then you always
have 1 storm to begin with from Doomsday itself. Additionally if you plan on
casting all cards used in the Doomsday pile then you get to add 5 storm from
that. Breaking down the cards sets of pre-pile, pile and wish targets helps the
mind easily compute what storm count you will end up with a certain line of
play.

### Single cantrip piles

There are basically two variants to this pile. You either have a spell that
draws a single card in hand ready to cast, or a Conjurer's Bauble in play. For
the moment, the difference does not really matter and we'll just assume that you
have a either castable P in hand taking into account the extra U cost or a Street Wraith
you can cycle in hand.

*Ideas Unbound*

```
SW in hand.
-> IU, LED, P, LED, BW(ToA)                BBB+UUU (6)   7 Storm
```

1. Cast Doomsday build: [IU, LED, P, LED, BW]
- Cycle SW, draw (IU)
2. Cast IU, draw (LED, LED, P)
3. Cast LED
4. Cast LED
5. Cast P, hold priority crack LEDs for BBB+RRR, draw (BW)
6. Cast BW targeting ToA
7. Cast ToA

This pile has cost you BBB+UUU and 2 life (excluding Doomsday life loss)
and results in 7 storm, that is 14 lifeloss. Note that UUU is often paid 
for by a Lion's Eye Diamond. With a cantrip over street wraith, a Dark Ritual
(to cast Doomsday) and a Lion's Eye Diamond preceding the Doomsday you 
already generate enough storm to cause 20 lifeloss. 

As for the remarks about priority in step 6, It's best to announce that you
would like to hold priority when casting the next spell, before you actually
announce which spell that is. This way there can be no discussion about that you
waited too long between announcing the spell and stating that you want to hold
priority after casting it. This may be a bit overly cautious, but there's no
harm and in this way you can avoid unwarranted judge calls during tournament play.

*Infernal Contract*

```
P in hand.
-> IC, DR, DR, LP, ToA                BBB+UBBB (7)   7 Storm
```

1. Cast Doomsday build: [IC, DR, DR, LP, ToA]
2. Cast P, draw (IC)
3. Cast IC, draw (DR, DR, LP)
4. Cast LP
5. Cast DR
6. Cast DR
7. Cast ToA

This pile has cost you BBB+UBBB and half your life (twice)and results in 7 storm, that is 14
lifeloss. Note that BBB is often paid for by a Lion's Eye Diamond. With a Dark
Ritual (to cast Doomsday) and a Lion's Eye Diamond preceding the Doomsday you
already generate nearly enough storm to cause 20 lifeloss. 

One thing to keep track of is life total with IC. Doomsday and IC both round **up** with life
loss so if you cast either whilst at 1 life you will die. The lowest life you can start the pile 
on is 4 (Doomsday will set you down to 2 life, then IC will set you down to 1 life) so be mindful
of this when knowing when you can and cannot go off with IC.

*Act on Impulse*

```
P in hand.
-> SW, AoI, LED, LED, BW(ToA)               BBB+2UR (7)    7 Storm
```

1. Cast Doomsday build: [SW, AoI, LED, LED, BW]
2. Cast P, draw (SW)
- Cycle Street Wraith, draw (AoI)
3. Cast AoI, exile (LED, LED, BW)
4. Cast LED
5. Cast LED
- Crack LEDs for BBB+RRR
6. Cast BW targeting ToA
7. Cast ToA

This pile costs BBB+2UR and 2 life and results in 7 storm, which is 14 lifeloss.
Like with Ideas Unbound, the mana cost for the draw spell (2R) can be - and
often is - paid for by a Lion's Eye Diamond in response to the first P. The
most important difference is that Act on Impulse not actually draws but exiles the
cards. This means that Lion's Eye Diamond's activation cost will not affect your
ability to cast the cards 'drawn' with Act on Impulse. If you are low on life can
also build [AoI, LED, LED, BW, X] and directly 'draw' Burning Wish with Act on Impulse,
this will produce once less storm however it does let you 'hide' a card
in your Doomsday stack from your opponent.

### Double cantrip piles

*Ideas Unbound*

```
P, P in hand.
-> LED, IU, LP, DR, ToA                BBB+UU (5)   8 Storm
```

1. Cast Doomsday build: [LED, IU, LP, DR, ToA]
2. Cast P, draw (LED)
3. Cast LED
4. Cast P, hold priority crack LED for UUU, draw (IU)
5. Cast IU, draw (LP, DR, ToA)
6. Cast LP
- Crack LP for B
7. Cast DR
8. Cast ToA

This pile has cost only BBB+UU to execute and results in 8 storm,
which is 16 lifeloss. This pile is quite efficient when it comes to mana. We use
the additional cantrip to draw a Lion's Eye Diamond before executing the rest of
the pile and use that Lion's Eye Diamond to pay for much of the rest of the
pile. We basically turn our additional cantrip into a Lion's Eye Diamond
with Doomsday.

One difficulty with this pile is that Ideas Unbound actually draws Burning Wish
meaning this is limited to using with a maindeck Tendrils.

*Act on Impulse*

```
P, P in hand.
-> LED, AoI, LED, LED, BW(ToA)               BBB+UU (5)   9 Storm
```

1. Cast Doomsday build: [LED, AoI, LED, LED, BW]
2. Cast P, draw (LED)
3. Cast LED
4. Cast P, hold priority crack LED for RRR, draw (AoI)
5. Cast AoI, exile (LED, LED, BW)
6. Cast LED
7. Cast LED
   - Crack LEDs for BBB RRR
8. Cast BW targeting ToA
9. Cast ToA

This pile is relatively efficient at BBB+UU for 9 storm. The key idea is that,
strictly speaking we only needed AoI, LED, LED, BW in our single cantrip pile.
Meaning that if we shift this 4 card pile to the bottom, we can put any card on
top. In this case we put a Lion's Eye Diamond on top, which we draw with
Ponder. The Lion's Eye Diamond then pays for the Act on Impulse, which
exiles the other two LEDs and the Burning Wish we need to produce mana and wish
for and cast Tendrils.

## Variations

That's it for the basic and most common piles that end with Tendrils of Agony.
There are many variations of each pile and it doesn't really make sense to list
them all. In each of the above piles you may replace Ponder with a Preordain or 
Conjurer's Bauble or a Street Wraith cycle (however note this does not work when exiled with AoI).
Also, since Act on Impulse and Three Wishes function very similarly, all piles involving
Act on Impulse can be executed with Three Wishes all the same, except for a
different mana cost. The use of Conjurer's Bauble to draw into the piles allows
for lower mana or life costs but does result in less storm being generated
during the play line.

The most important part of learning how to cast Doomsday, is to think how you
would like to cast a lethal Tendrils of Agony, and then think of the cards
you'll need to get there. Doomsday is essentially a 5 card tutor.

The trick is to try not to think of the specifics too much. Try to break
everything down into resources. The key ones are the cards you hold in hand, the
mana available, any other cards in play like Conjurer's Bauble and your deck
construction. As you get more familiar with these factors you can then start to
consider your opponent as a factor and become more experienced in generating
piles on the fly to fit whatever gameplay scenario you might come across.

As for the other piles out there, there are countless piles that use Brainstorm
to draw some cards and put some other cards back. This particular trick allows
you to exchange cards in hand with cards that you've tutored up with Doomsday.
As you can imagine this results in a large number of combinations of
Brainstorm + some other cards in hand that enable different Doomsday piles for
different mana costs and storm counts.

## Summary

1. You generally need a card to draw or exile you three or four cards into your stack.
2. Lethal storm via Tendrils of Agony is the most common win condition for the
   deck.
3. Holding priority when cantripping with LED in play is key, make sure to get
   into this habit.

## Get Started

You now have sufficient information to start practicing! Since the Gitaxian Prove banning
there has yet to be defined agreement on how the archetype should look (some say it should 
just stop but there are some very loycal, stubborn people out there!). As a result I would advise
chatting to other's via Reddit or the Discord to try and get a starting list to go by.
