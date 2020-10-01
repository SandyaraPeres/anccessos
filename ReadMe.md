# **anccessos**

Use anccessos in your Kotlin Shared Projects to promote accessible coding for Screen Readers such as VoiceOver and TalkBack. :)
Compatible only with Kotlin Android for now, this is a Work in Progress.

## How to use it

Apply at your view the method `setAccessibility()`
For now, you can set if the view's:
* Class name;
* Content Description;
* If it's a heading;
* If it's a password;
* If it's in a checked state;
* If it's enabled or not;
* If it's selected or not;
* If it's clickable (or long clickable) or not

Here's an example applying in my Android project:

`myView.setAccessibility(className = Button::class.java, contentDescription = "Apply for this job")`
 
## License
        
    Copyright 2020 SandyaraPeres
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
