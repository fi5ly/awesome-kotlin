
import link.kotlin.scripts.Article
import link.kotlin.scripts.LinkType.*
import link.kotlin.scripts.model.LanguageCodes.*
import java.time.LocalDate

// language=Markdown
val body = """
At a recent conference, I happened upon some information about the programming language, Kotlin. I had heard of it, but never looked into anything about it. After taking a casual look at it, I’m strongly considering giving it a shot on a “real” project. Read on to find out why. My background is primarly Java programming, followed closely by Ruby. I’ve had experience with numerous other languages over the years, but usually only on a small number of projects, or on projects old enough that I don’t consider myself current. Java is my favorite overall. Ruby has lots of great benefits in certain types of projects, so it’s a handy tool to have around as well. So what about Kotlin?

Kotlin was developed by JetBrains, the makers of IntelliJ IDEA and other IDE variants as well as other developer tools. Kotlin is a statically typed language that runs on the Java Virtual Machine. It is not syntax compatible with Java, but both Java and Kotlin source files can seamlessly interoperate within the same code base. That is a pretty huge benefit if you’d like to try it out in an existing Java project and can not afford to spin up an entirely new rewrite. The language was first announced in 2011 and was open sourced in 2012. The version 1.0 release became available earlier this year. The language supports object oriented and procedural programming. And, like Scala, it tackles many of the shortcomings and inconveniences from Java. For example, Kotlin makes a distinction between nullable and non-nullable types, so you must explicitly indicate that variables can be null.  It allows you to write concise, clear code and reduce lots of boilerplate which is often a big complaint with Java.

So why not just use Scala? In my case, a language needs to really sell me on the benefits and low cost of adoption for it to be worth my time to consider incorporating it into my toolset. Scala just never seemed convenient enough in my cursory glances at it. But Kotlin seems to have knocked down those barriers to entry. It has fantastic tool support in IntelliJ. You can even have the IDE automatically convert Java code to Kotlin if you want. Since Kotlin source code is perfectly happy to live alongside Java code, it is trivial to transition at your own pace or give it a trial run without too much overhead. You can call any existing Java code directly and easily from Kotlin code and vice versa. Kotlin is even quickly gaining ground as a go to platform for Android development.

At this point, I’ve only looked at a few tutorial examples to start getting my feet wet, so I can’t speak to the long term transition and adoption. However, it was ridiculously easy to get started and that is a serious win in my book. I enjoyed it enough to actually take a look at using it on some upcoming personal projects. I’m interested to see how it plays alongside some of my goto Java frameworks like Spring Boot, etc., although it will almost certainly be pretty seamless. JetBrains has committed to long term support of the language so it’s not going away anytime soon.

I’m not one to jump over to the latest and greatest languages that show up on the radar. They usually turn out to be more effort than they are worth for me. However, Kotlin has definitely piqued my interest and I will be taking a closer look at how I can incorporate it my projects. Great benefits to efficiency, low barriers to entry, and low risk. With features like that, if you are a Java developer, it might be a language you are interested in as well. If you’ve tried it already, let me know about your experiences with it.

"""

Article(
  title = "The Next Language You Thought You Didn’t Need",
  url = "http://www.dellingertechnologies.com/2016/08/17/kotlin-the-next-language-you-thought-you-didnt-need/",
  categories = listOf(
    "Kotlin"
  ),
  type = article,
  lang = EN,
  author = "Jay Dellinger",
  date = LocalDate.of(2016, 8, 17),
  body = body
)
