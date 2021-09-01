package animals;

interface BirthOfChildren{
    void giveBirth();
}

interface LayEggs extends BirthOfChildren{
    @Override
    void giveBirth();
}
interface WearInBag extends BirthOfChildren{
    @Override
    void giveBirth();
}
interface GiveBirth extends BirthOfChildren{
    @Override
    void giveBirth();
}