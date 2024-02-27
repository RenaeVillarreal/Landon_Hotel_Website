# Advanced Java – D387

## Landon Hotel Website 

<p align="center">
<img src="https://imgur.com/RVxKBFq.png" height="120%" width="120%" alt="Program CLI"/>
</p>
<p align="center">
<img src="https://imgur.com/Acxlt96.png" height="120%" width="120%" alt="Program CLI"/>
</p>
<p align="center">
<img src="https://imgur.com/fZ101Av.png" height="120%" width="120%" alt="Program CLI"/>
</p>
<p align="center">
<img src="https://imgur.com/1o9aBIi.png" height="120%" width="120%" alt="Program CLI"/>
</p>

### Description

This is my website for The Landon Hotel. The webiste keeps track of all rooms available for each of the dates allowing only rooms that are free to show up. If a room is taken they webiste will not display the room for the user entered dates (try a different date). This program has a frontend and backend that can be hosted via docker or locally through localhost:8080.

## Usage for cloning and local host

To clone the code in IntelliJ IDEA please download and open the community version or ultimate: 
Navagate to the welcome screen
<p align="center">
<img src="https://imgur.com/DPDMqrx.png" height="100%" width="120%" alt="Program CLI"/>
</p>
Please click on "Get From VSC"
<p align="center">
<img src="https://imgur.com/5IGbH2S.png" height="100%" width="120%" alt="Program CLI"/>
</p>
Copy the link 

```commandline
https://github.com/RenaeVillarreal/PackageDeliveryProject.git
```

Paste it in the URL section and click clone
<p align="center">
<img src="https://imgur.com/kVT77Cq.png" height="100%" width="120%" alt="Program CLI"/>
</p>
Once that is done building, in IntelliJ click on the M on the right toolbar and hit the refresh button to make sure the plugins and dependencies have been set properly
<p align="center">
<img src="https://imgur.com/YAEV2iZ.png" height="100%" width="120%" alt="Program CLI"/>
</p>
Hit the Green Run button on the top of the screen
<p align="center">
<img src="https://imgur.com/vVlBk3i.png" height="100%" width="120%" alt="Program CLI"/>
</p>
Once these steps are done in that order please open and empty browser and type in localhost:8080
<p align="center">
<img src="https://imgur.com/v5Rsbbl.png" height="100%" width="120%" alt="Program CLI"/>
</p>


# !Ignore! Edits
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

C3.TimeConversion,Line-6: created a new class for my time conversions

C3.TimeConversion,Line-8: created a getConvertedTimes using zoneDataTime

C3.TimeConversion,Line-9: converted times for zoneId America/Newyork

C3.TimeConversion,Line-10: converted times for zoneId America/Denver

C3.TimeConversion,Line-11: converted times for zoneId UTC

C3.TimeConversion,Line-13: return converted times 

C3.TimeConversion,Line-16: created another method with protect string for the controller to grab the times

C3.TimeConversion,Line-17: used zoneDateTime to grab original time (now) and split it

C3.TimeConversion,Line-18: added int hours to hold the hours

C3.TimeConversion,Line-19: added int minutes to hold minutes

C3.TimeConversion,Line-20: created a string to display time in 12hr clock format

C3.TimeConversion,Line-21: arg for 12-hour clock 

C3.TimeConversion,Line-22: return string.format for 12-hour clock

C3.TimeZoneConversionController,Line-12: added @ Restcontroller

C3.TimeZoneConversionController,Line-13: added @ RequestMapping /api

C3.TimeZoneConversionController,Line-14: added @ CrossOrigin for communication

C3.TimeZoneConversionController,Line-15: created a public class called TimeZoneConversionController

C3.TimeZoneConversionController,Line-17: added @ Getmapping with /converted-times extension

C3.TimeZoneConversionController,Line-18: created a public convertedties to combine my multithreads

C3.TimeZoneConversionController,Line-19: added AtomicReference to hold string

C3.TimeZoneConversionController,Line-20: used ZoneDatetime to grab the time with the (now)

C3.TimeZoneConversionController,Line-22: created a thread for ET

C3.TimeZoneConversionController,Line-23: added a new time conversion to hold time

C3.TimeZoneConversionController,Line-24: using ettime with string to combine the times into a single string to display

C3.TimeZoneConversionController,Line-25: combined ettime using atomicReference to add this time with updateandget

C3.TimeZoneConversionController,Line-28: created a thread for MT

C3.TimeZoneConversionController,Line-29: added new time conversion to hold time

C3.TimeZoneConversionController,Line-30: using mttime with string to combine the times into a single string to display

C3.TimeZoneConversionController,Line-31: combine mttime using atomicReference to add this time with updateandget

C3.TimeZoneConversionController,Line-34: created a thread for UTC

C3.TimeZoneConversionController,Line-35: added new time conversion to hold time

C3.TimeZoneConversionController,Line-36: using utctime with string to combine the time into a single string to display

C3.TimeZoneConversionController,Line-37: combine utctime using atomicReference to add this time with updateandget

C3.TimeZoneConversionController,Line-40: started etthread

C3.TimeZoneConversionController,Line-41: started mtthread

C3.TimeZoneConversionController,Line-42: started utcthread

C3.TimeZoneConversionController,Line-44: used a try catch block to join thread 

C3.TimeZoneConversionController,Line-45: et thread.join

C3.TimeZoneConversionController,Line-46: mt thread.join

C3.TimeZoneConversionController,Line-47: uts thread.join

C3.TimeZoneConversionController,Line-48: ended catch block if error grab message

C3.TimeZoneConversionController,Line-49: error throw stacktrack error 

C3.TimeZoneConversionController,Line-52: return new convertedTimes with .get()

C3.ConvertedTimes,Line-7: added @ AllArgsConstructor

C3.ConvertedTimes,Line-8: added @ Getter for lombak

C3.ConvertedTimes,Line-9: added @ Setter for lombak

C3.ConvertedTimes,Line-10: created a public class called ConvertedTimes to communicate to the front end

C3.ConvertedTimes,Line-11: declared string named convertedTimes

C3.app.component.ts,Line-31: added convertedTimes as an empty string

C3.app.component.ts,Line-43: used this.get to grab the convertedTimes and .subscribe to grab the data

C3.app.component.ts,Line-44: set this. to data. named convertedTimes

C3.app.component.ts,Line-103: getConvertedTimes using Observable (any)

C3.app.component.ts,Line-104: return the httpclient that was set in the controller base/api/converted-times

C3.app.component.ts,Line-119: export Time interface 

C3.app.component.ts,Line-120: message set as a string from the request ConvertedTimes class

C3.app.component.html,Line-28: added a section for the called presentation info

C3.app.component.html,Line-29: added a h2 line explaining the start time of the live presentation for the different time zones

C3.app.component.html,Line-30: added a p to point users in the correct spot for there current time zone

C3.app.component.html,Line-31: added the ConvertedTimes to display in a single line

C3.app.component.html,Line-32: closed the presentation info section 

## D1

D1.Dockerfile,Line-1: Created a docker file and Added FROM and my java version (amazoncorretto 17)

D1.Dockerfile,Line-3: added a WORKDIR called it /app

D1.DockerFile,Line-5: used copy target/my jar name in maven I ran mvn clean package to package my files

D1.DockerFile,Line-7: called port 8080 so my container can run on localhost:8080

D1.DockerFile,Line-9: used CMD for my java type and jar name 

## D2

D2.Project Terminal: ran docker build -t and my image name to build my image 

D2.Project Terminal: ran docker run --name -p -d to build and name my container with my image

D2.Project Terminal: ran docker log to prove my container is running in port 8080

D2.Project Terminal: ran docker ps to show my container is running while screenshotted localhost8080

## D3

D3. First I would choose Amazon Web Services(AWS), after signing up I would make sure my application is containerized using docker. Meaning create a docker image that contains my code, dependencies and a Dockerfile that specifies how to run it. Then create a repository using Elastic Container Registry (ECR) to store my docker image. Pushing my image to the ECR using docker. Decide what infrastructure to us depending on my application. Next a service would need to be created to manage the deployment of my containers. Configure networks for my application that will help with balancing everything together. Test my application thoroughly add in a backup and recovery and finally document my process.    

