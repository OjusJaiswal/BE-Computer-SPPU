################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../A1(a).cpp 

OBJS += \
./A1(a).o 

CPP_DEPS += \
./A1(a).d 


# Each subdirectory must supply rules for building sources it contributes
A1(a).o: ../A1(a).cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cross G++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"A1(a).d" -MT"A1(a).d" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


