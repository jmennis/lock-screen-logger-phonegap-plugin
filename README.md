lock-screen-logger-phonegap-plugin
========================
Target Cordova
------
version 3.*

Supported paltforms
------
* iOS
* Android (THIS IS WIP!!!)

Instructions
------
1. Add plugin to your project: cordova plugin add https://github.com/jmennis/lock-screen-logger-phonegap-plugin.git
2. Enable the background mode "Background fetch" in the "Capabilities" section of the XCode project.
3. Call the Screen.start(screenOnCallback, screenOffCallback) function to start handling screen locking events. screenOnCallback and screenOffCallback are the methods to handling locking events.

License
------
Apache License, Version 2.0

Credits
------
(c) [Citronium](http://citronium.com), 2014
(c) Jmennis, 2016
