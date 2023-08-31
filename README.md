

# WESTERN GOVERNOR UNIVERSITY 
## D387 – ADVANCED JAVA

## Format C#.filename,line#:Edit/Change

## C1

C1.Resource Bundle 'messages',Folder: Created a bundle to hold my en_US and fr_CA messages.properties

C1.messages_en_US.properties,Line-1: added my 'key' and welcome message for english

C1.messages_fr_CA.properties,Line-1: added my 'key' and welcome message for Canada_French

C1.DisplayMessage,Line-7: created a displaymessage class to handle the .get of the resource bundle 'message'

C1.DisplayMessage,Line-8: used String.getWelcome to get/enter locale 

C1.DisplayMessage,Line-9: created bundle constructor to retrieve the messages in bundle

C1.DisplayMessage,Line-10: return the messages with the 'welcomeMessage' key

C1.WelcomeController,Line-12: added @ RestController 

C1.WelcomeController,Line-13: added @ RequestMapping with my extension /api

C1.WelcomeController,Line-14: added @ CrossOrgin to allow communication 

C1.WelcomeController,Line-15: made a public WelcomeController class to handle the threads 

C1.WelcomeController,Line-17: added @ GetMapping with extension /welcome to hold both threads for each message

C1.WelcomeController,Line-18: made public Send Messages class to control both threads and combine then into one

C1.WelcomeController,Line-19: made use of the atomicreference<string> in order to grab each message 

C1.WelcomeController,Line-20: made english thread 

C1.WelcomeController,Line-21: used a new display message for the english thread inside of thread

C1.WelcomeController,Line-22: used a system.out.println to check if thread were displaying properly

C1.WelcomeController,Line-23: grabbed the english message with .get(locale_US)

C1.WelcomeController,Line-24: combined messages with .updateandget displaying message with "English: " for order

C1.WelcomeController,Line-27: made french thread

C1.WelcomeController,Line-28: new display message for french thread

C1.WelcomeController,Line-29: used a system.out.print to check if thread was displaying 

C1.WelcomeController,Line-30: grabbed the french message with .get(locale_Canada_French)

C1.WelcomeController,Line-31: combined messages with .updateandget displaying messages with "French: " for order

C1.WelcomeController,Line-34: started english thread

C1.WelcomeController,Line-35: started french thread

C1.WelcomeController,line-37: used a try catch block to combine both messages

C1.WelcomeController,Line-38: .join() for english

C1.WelcomeController,Line-39: .join() for french

C1.WelcomeController,Line-40: ended catch block 

C1.WelcomeController,Line-41: if error display stacktrack error

C1.WelcomeController,Line-44: retunr new SendMessage with (combinedMessage.get())

C1.SendMessages,Line-8: used @Getter for lombak

C1.SendMessages,Line-9: used @Setter for lombak 

C1.SendMessages,Line-10: used @AllArgsConstructor for lombak

C1.SendMessages,Line-11: created public SendMessages class to communicated with front end (module) for the string message

C1.app.component.ts,Line-30: added constructor for combinedWelcomeMessage = to empty string 

C1.app.component.ts,Line-38: used this.getWelcomeMessage and the subscribe data to grab the messages 

C1.app.component.ts,Line-39: added this.combinedWelcomeMessage = data.message to hold messages

C1.app.component.ts,Line-90: used observable <any> for the getWelcomeMessage

C1.app.component.ts,Line-91: returned the http extension that was set for this welcome message with response type 'json'

C1.app.component.ts,Line-102: added export interface for Welcome

C1.app.component.ts,Line-103: added message as a string

C1.app.component.html,Line-25: added column size to display messages on seperate lines

C1.app.component.html,Line-26: added the combinedWelcomeMessage to grab the messages and display them

## C2

C2.app.component.ts,Line-59: added a for const to get the price and do a crud equation

C2.app.component.ts,Line-60: for priceCAD added crud equation to produce CAD

C2.app.component.ts,Line-61: for priceEUR added crud equation to produce EUR

C2.app.component.ts,Line-119: added priceCAD string in room interface

C2.app.component.ts,Line-120: added priceEUR string in room interface

C2.app.component.html,Line-81: added Price 'USD' and a new line after

C2.app.component.html,Line-82: added Price 'CAD' and the room.priceCAD to grab price and display it

C2.app.component.html,Line-83: added price 'EUR' and the room.priceEUR to grab price and display it 

## C3

