package com.company;

public class ComputerGameToPCGameAdapter implements PCGame{

    private ComputerGame computerGame;

    public ComputerGameToPCGameAdapter(ComputerGame computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public String getTitle() {
        return computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        switch (computerGame.getPegiAgeRating()){
            case P3 -> {return 3;}
            case P7 -> {return 7;}
            case P12 -> {return 12;}
            case P16 -> {return 16;}
            case P18 -> {return 18;}
        }
        return -1;
    }

    @Override
    public boolean isTripleAGame() {
        if(computerGame.getBudgetInMillionsOfDollars() > 50000000)
            return true;
        else
            return false;
    }

    @Override
    public Requirements getRequirements() {
        Integer gpuGB = computerGame.getMinimumGpuMemoryInMegabytes() / 1024;
        Integer hddGB = computerGame.getDiskSpaceNeededInGB();
        Integer ramGB = computerGame.getRamNeededInGb();
        Double cpuGHZ = computerGame.getCoreSpeedInGhz();
        Integer coresNum = computerGame.getCoresNeeded();

        return new Requirements(gpuGB, hddGB,ramGB, cpuGHZ, coresNum);
    }
}
