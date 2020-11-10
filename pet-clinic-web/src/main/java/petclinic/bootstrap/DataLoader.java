package petclinic.bootstrap;

import com.springpetclinic.pet.model.Owner;
import com.springpetclinic.pet.model.Pet;
import com.springpetclinic.pet.model.PetType;
import com.springpetclinic.pet.model.Vet;
import com.springpetclinic.pet.services.OwnerService;
import com.springpetclinic.pet.services.PetTypeService;
import com.springpetclinic.pet.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog =  new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat =  new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);



        Owner owner1 = new Owner();
        owner1.setFirstName("Michel");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brikere");
        owner1.setCity("Miami");
        owner1.getTelephone("1234567");

        Pet mikiesPet = new Pet();
        mikiesPet.setPetType(savedDogPetType);
        mikiesPet.setOwner(owner1);
        mikiesPet.setBirthDate(LocalDate.now());
        mikiesPet.setName("Kimi");
        owner1.getPets().add(mikiesPet);


        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenne");
        owner1.setAddress("123 Brikere");
        owner1.setCity("Miami");
        owner1.getTelephone("99934567");


        Pet fionasPet = new Pet();
        fionasPet.setPetType(savedCatPetType);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("Tess");
        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Alx");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ana");
        vet2.setLastName("Samson");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");



    }
}
