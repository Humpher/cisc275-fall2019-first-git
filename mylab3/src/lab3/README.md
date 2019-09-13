# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

	1.List<Dog> dogs = new ArrayList<Dog>();
	2.	dogs.add(new Dog("Fido", 4));
	3.	dogs.add(new Dog("Fido", 3));
	4.	dogs.add(new Dog("Alfie", 4));
	5. Collections.sort(dogs, new Comparator<Animal>()
	

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
The Comparator constructor call is: new Comparator<Animal>() and the definition of the class is : @Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}