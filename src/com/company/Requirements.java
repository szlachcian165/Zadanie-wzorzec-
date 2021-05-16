package com.company;

import lombok.AllArgsConstructor;

public class Requirements {
    private final Integer gpuGb;
    private final Integer HDDGb;
    private final Integer RAMGb;
    private final Double cpuGhz;
    private final Integer coresNum;

    @Override
    public String toString() {
        return "Requirements{" +
                "gpuGb=" + gpuGb +
                ", HDDGb=" + HDDGb +
                ", RAMGb=" + RAMGb +
                ", cpuGhz=" + cpuGhz +
                ", coresNum=" + coresNum +
                '}';
    }

    public Requirements(Integer gpuGb, Integer HDDGb, Integer RAMGb, Double cpuGhz, Integer coresNum) {
        this.gpuGb = gpuGb;
        this.HDDGb = HDDGb;
        this.RAMGb = RAMGb;
        this.cpuGhz = cpuGhz;
        this.coresNum = coresNum;
    }
}
