package exercises_One;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
  private List<Pet> petList = new ArrayList<>();

  public Pet findPet(String name) {
    for(Pet p: petList){
      if(p.name.equals(name)){
        return p;
      }
    }
    return null;
  }

  public void addPet(Pet pet) {
    petList.add(pet);
  }

  public int totalPets() {
    return petList.size();
  }

  public void sellPet(String name) {
    /*for(Pet p : petList){
      if(p.name.equals(name)){
        petList.remove(p);
      }
    }*/
    petList.removeIf(x -> x.name == name);
  }
}
