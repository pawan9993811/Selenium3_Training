Difference Between Implicit, Explicit and Fluent Wait

Implicit Wait: During Implicit wait if the Web Driver cannot find it immediately because of its availability, 
               it will keep polling (around 250 milli seconds) the DOM to get the element. If the element is 
               not available within the specified Time an NoSuchElementException will be raised. The default 
               setting is zero. Once we set a time, the Web Driver waits for the period of the WebDriver object instance.

Explicit Wait: There can be instance when a particular element takes more than a minute to load. In that case you
               definitely not like to set a huge time to Implicit wait, as if you do this your browser will going 
               to wait for the same time for every element.

				To avoid that situation you can simply put a separate time on the required element only. 
				By following this your browser implicit wait time would be short for every element and 
				it would be large for specific element.

Fluent Wait: Let’s say you have an element which sometime appears in just 1 second and some time it takes 
			  minutes to appear. In that case it is better to use fluent wait, as this will try to find element 
			  again and again until it find it or until the final timer runs out.