# Android-OOP Sprint Challenge

## Instructions

**Please read this entire README to make sure you understand what is expected of you before you begin.**

You've learned a bunch of things so far, and this Sprint Challenge will use a lot of what you've already learned while mixing in some of the OOP Concepts we've learned this week.

Let's remember to follow best practices such as using a  good, consistent code style, commiting often, and writing good commit messages. Those things will be part of your life as an Android developer, so let's start practicing now. We'll be checking this out and it can factor into your score (in addition to meeting the challenge requirements).

Fork this repository and clone your fork to your computer. Create your Android Studio project in this cloned fork repository folder, then commit and create a pull request. Commit appropriately as you work. When finished, push your final project to GitHub and comment on the pull request to indicate that your project is complete.

You have *3 hours*, and you should work *independently* — looking things up (search, notes) is all fair game. And questions about *process* / *logistics* (i.e. if you have a hard time opening/saving to GitHub) are fair game too.

Good luck!

## Requirements

Let's build a Master/Detail project that uses MVVM, Inheritance, Interfaces, and Generics.

We're going to use the Age of Empires II API (You might be experiencing of Sci-Fi and games overload, but good API's that don't require authentication and/or an API key are hard to come by!). It's located at:

[https://age-of-empires-2-api.herokuapp.com/docs]

Here's an outline of the steps with some hints:

1. Create a new project using the Master/Detail template. We used this in class, AND3's Abstraction, Interfaces, and Polymorphism lesson). The template should create three classes: ItemDetailActivity, ItemListActivity, and ItemDetailFragment. You'll also be given a package with some Dummy data. We're going to replace the dummy data with a retrofit API.

2. We want to use the MVVM style, so create packages for your model, view, and viewmodel. Name your packages appropriately, and put your generated classes in a place that makes sense for the MVVM structure.

3. Build your model classes. The API we are using has endpoints for civilizations, units, structures, and technologies. We want to create a list containing all the different API objects, and we want to be able to display something meaningful in our RecyclerView.
  * You'll be provided with a set of fake data to use. Examine the data to figure out how to extract attributes from each class to construct your class hierarchy. We want to be able to put all this data in the same list structure.
  * In your class hierarchy, create description function that will give us information specific to each type of object, but we don't want to have to check the type (in other words, we want to use polymorphism).
  * In addition to the attributes provided in the data set, add a Boolean variable that tracks some state - choose something that interests you, perhaps `isFavorite` or `isInUse` - about the API objects. Every type of object should have this state (where is the best place to put it?). You can provide a default value of false.
  * Go to your layout files and add a TextView or other UI element to display the description you have created (`item_list_content.xml` and `item_detail.xml` are good places). Also add UI to display and change the state you have added. You might use a Button, an ImageView, a CheckBox, or something else of your choosing, just make sure you can both change the value of the object and display the value after it has changed.

4. Create your ViewModel. You don't have to use Data Binding for this part, just create a class that will hold your data. This data should hold the fake data you are provided, and the `ItemListActivity` will create a member variable to hold the ViewModel. When it needs data, the `ItemListActivity` should get the data from the ViewModel.

5. In the ItemDetailFragment, you will create a way to let the attached Activity show a Toast message when the state has changed on the detail.
  * Inside your Fragment class, create an interface that has a single method. This method should pass back an API object.
  * Make the two Activities implement your Fragment interface. In the interface function for each Activity, show a Toast that displays information about the item that was changed and the Activity that is showing the Toast.
  * In your Fragment's onAttach method, store the Activity in a member variable so that you can call it when your UI element is activated (onClickListener or otherwise).
  * In your Fragment's onDetach method, release the Activity by setting the member variable to null.

Requirements
1. You have successfully created a Master/Detail Activity.
2. You have created a class hierarchy that allows us to put all API objects together in a list and to call methods on each object polymorphically.
3. You have used MVVM architecture.
  * You have created packages.
  * You have placed your Model, View, and ViewModel in the appropriate packages.
  * You have successfully separated concerns. Business logic is in the right class(es).
4. You have created an interface in your Fragment.
  * You have an interface function that returns the item to the class that implements the interface.
  * You have attached and detached correctly in the Fragment.
  * You are showing a Toast in each Activity that shows information about the item and the Activity.

STRETCH GOALS
5. Try to use Data Binding or LiveData in your ViewModel. We haven't covered LiveData in class yet, so it may be very challenging.
6. Create a retrofit package and build a set of retrofit calls to get data from the server instead of the dummy data. In your ViewModel, set up calls to fetch the data.