# PA2

Completed with Evan Typanski (et3fx, github evantypanski) and Rachel Weeks (rfw5wb, github rfw5wb)

Who did what: Evan worked mostly on scanner, Rachel did test cases and went to office hours for clarification.  Other than that, pair programmed the rest.

Problems:

- MJSIM only works when running `java -jar MJSIM.jar -b -f PA2FlowerSimple.java.s`, but grading seems to exclude `-b -f`

- Compiled Java seems to stop printing after 5 lines if run as `java PA2FlowerSimple`

- Removed & from Makefile in order to properly work

- Removed `System.exit(0);` call in `mj.cup` as it was exiting program early

- Errors not provided for cases where there is no error possible with the scanner

Emails:

> Hi Sanil,
> Evan and I were working on PA2 and had a few questions!
> First: For part II in the grading rubric, there are points for generating code with different constant integer expressions and for byte casting. Should our program be able to automatically cast integers to bytes? Because we thought setPixel is supposed to take byte input types.
> Second: For the instructions given in Part II the assembly has two load instructions to the same register. Is this correct, and does it have to do with byte casting?
> Last: In Part I we ran into problems with errspecial recognizing '|' as an acceptable symbol. This should not happen, but we were thinking it's maybe because we use them as an 'or' in regular expressions. How do we have err files for reserved words and phrases (if you miss use reserved words they will just be ids)?
> We appreciate the help!
> Thanks,
> Rachel and Evan

> For your first question I have asked the professor about this and will get back to you. I don't quite remember what the exact assembly was but if you used that in PA3ifdots and it worked thne it should be ok. I am not quite sure I understand your last question I don't think | should be considered an id. Could you provide an example?
> -Sanil

> Hey Rachel,
> If you just remove the | from your ID regex you should get the correct behavior. Tell me if that's not the case.
> -Sanil
