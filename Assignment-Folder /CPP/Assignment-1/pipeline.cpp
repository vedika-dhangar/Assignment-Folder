#include <iostream>
#include <cmath>
using namespace std;

// Calculate RMS
double computeRMS(double* signal, int n)
{
    double sum = 0;

    for (int i = 0; i < n; i++)
    {
        sum = sum + (*(signal + i) * *(signal + i));
    }

    return sqrt(sum / n);
}

// Normalize the signal
void normalise(double* signal, int n)
{
    double maxValue = 0;

    // Find maximum absolute value
    for (int i = 0; i < n; i++)
    {
        if (abs(*(signal + i)) > maxValue)
        {
            maxValue = abs(*(signal + i));
        }
    }

    // Divide every element by max value
    for (int i = 0; i < n; i++)
    {
        *(signal + i) = *(signal + i) / maxValue;
    }
}

// Count zero crossings
int countZeroCrossings(double* signal, int n)
{
    int count = 0;

    for (int i = 0; i < n - 1; i++)
    {
        if ((*(signal + i) < 0 && *(signal + i + 1) > 0) ||
            (*(signal + i) > 0 && *(signal + i + 1) < 0))
        {
            count++;
        }
    }

    return count;
}

// Apply gain
void applyGain(double* signal, int n, double gainFactor)
{
    for (int i = 0; i < n; i++)
    {
        *(signal + i) = *(signal + i) * gainFactor;
    }
}

// Print array
void printArray(double* signal, int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << *(signal + i) << " ";
    }

    cout << endl;
}

int main()
{
    double signal[] = {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};

    int n = 7;
    double gainFactor = 2.0;

    cout << "Original signal: ";
    printArray(signal, n);

    double rms = computeRMS(signal, n);
    cout << "RMS = " << rms << endl;

    int crossings = countZeroCrossings(signal, n);
    cout << "Zero Crossings = " << crossings << endl;

    normalise(signal, n);

    cout << "After Normalisation: ";
    printArray(signal, n);

    applyGain(signal, n, gainFactor);

    cout << "After Applying Gain: ";
    printArray(signal, n);

    return 0;
}